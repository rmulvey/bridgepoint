package org.xtuml.bp.utilities.actions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.ui.IActionDelegate;
import org.xtuml.bp.core.CorePlugin;
import org.xtuml.bp.core.common.NonRootModelElement;
import org.xtuml.bp.core.ui.CopyCutAction;
import org.xtuml.bp.io.core.CoreExport;

public class ExportOALInstances implements IActionDelegate {
	private ISelection selection = null;

	@Override
	public void run(IAction action) {
		List<NonRootModelElement> elementsToExport = new ArrayList<NonRootModelElement>();
		IStructuredSelection ss = (IStructuredSelection) this.selection;
		for (Iterator<?> i = ss.iterator(); i.hasNext();) {
			NonRootModelElement nrme = ((NonRootModelElement) i.next());
			elementsToExport.add(nrme);
		}

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		try {
			CoreExport exporter = (CoreExport) org.xtuml.bp.core.CorePlugin.getStreamExportFactory().create(outStream,
					elementsToExport.toArray(new NonRootModelElement[elementsToExport.size()]), true, true);
	
			exporter.setExportOAL(CoreExport.YES);
			exporter.setExportGraphics(CoreExport.NO);
			exporter.setExportOnlyOAL(true);
	
			 // Perform a parse-all to assure the model is up to date
			 exporter.parseAllForExport(elementsToExport.toArray(new
			 NonRootModelElement[elementsToExport.size()]), new NullProgressMonitor());
	
			exporter.run(new NullProgressMonitor());
	
			outStream.close();
		} catch (Exception e) {
			CorePlugin.logError("Failed to run the OAL instance export.", e);
			return;
		}
		// now format the result for export and put it on the clipboard.
		String streamContents = new String(outStream.toByteArray());
		streamContents = streamContents.replaceFirst("\n", "\n" + CopyCutAction.GENERIC_PACKAGE_HEADER + "\n");
		Clipboard cb = CorePlugin.getSystemClipboard();
		cb.clearContents();
		cb.setContents(new Object[] { streamContents }, new Transfer[] { TextTransfer.getInstance() });
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
