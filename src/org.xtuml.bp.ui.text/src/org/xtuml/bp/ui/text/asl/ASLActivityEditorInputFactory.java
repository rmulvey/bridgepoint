//======================================================================
//
// File: org.xtuml.bp.ui.text.activity/ASLActivityEditorInputFactory.java
//
//======================================================================
//
// This class serves as factory for ASL editor input.
// The code follows the pattern already set forth in the MASLEditorInputFactory.
// Specifically:
//   - The getSupportedElementList() defines which metamodel elements may contain ASL
//   - The other functions have traversals to proper action body containers even if
//       the model element isn't supported for ASL.  This code may never be executed 
//       but it is left in place to follow the established pattern and to prevent errors
//       if the supported element list changes.
package org.xtuml.bp.ui.text.asl;

import java.util.List;
import java.util.Vector;

import org.xtuml.bp.core.*;
import org.xtuml.bp.core.common.*;
import org.xtuml.bp.ui.text.AbstractModelElementEditorInputFactory;

public class ASLActivityEditorInputFactory extends AbstractModelElementEditorInputFactory {
	public static final String PLACEHOLDER_EXTENSION = "oal_err"; //$NON-NLS-1$

	private static List supportedList = null;

	protected List getSupportedModelElementList() {
		if (supportedList == null) {
			supportedList = new Vector();
			supportedList.add("org.xtuml.bp.core.Operation_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.Bridge_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.Function_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.ProvidedOperation_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.ProvidedSignal_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.RequiredOperation_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.RequiredSignal_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.TerminatorService_c"); //$NON-NLS-1$
			supportedList.add("org.xtuml.bp.core.StateMachineState_c"); //$NON-NLS-1$
		}
		return supportedList;
	}

	public String getType() {
		return PLACEHOLDER_EXTENSION;
	}

	public Class getEditorInputClass() {
		return ASLActivityEditorInput.class;
	}

	public NonRootModelElement getEditableModelElement(NonRootModelElement modelElement) {
		if (modelElement instanceof Action_c) {
			StateMachineState_c varStateMachineState = StateMachineState_c.getOneSM_STATEOnR511(
					MooreActionHome_c.getOneSM_MOAHOnR513(ActionHome_c.getOneSM_AHOnR514((Action_c) modelElement)));
			if (varStateMachineState != null) {
				return varStateMachineState;
			}
			Transition_c varTransition = Transition_c.getOneSM_TXNOnR530(
					TransitionActionHome_c.getOneSM_TAHOnR513(ActionHome_c.getOneSM_AHOnR514((Action_c) modelElement)));
			if (varTransition != null) {
				return varTransition;
			}
			CreationTransition_c varCreationTransition = CreationTransition_c
					.getOneSM_CRTXNOnR507(Transition_c.getOneSM_TXNOnR530(TransitionActionHome_c
							.getOneSM_TAHOnR513(ActionHome_c.getOneSM_AHOnR514((Action_c) modelElement))));
			if (varCreationTransition != null) {
				return varCreationTransition;
			}
		} else if (modelElement instanceof DerivedBaseAttribute_c) {
			Attribute_c varAttribute = Attribute_c
					.getOneO_ATTROnR106(BaseAttribute_c.getOneO_BATTROnR107((DerivedBaseAttribute_c) modelElement));
			if (varAttribute != null) {
				return varAttribute;
			}
		} else if (getSupportedModelElementList().contains(modelElement.getClass().getName())) {
			return modelElement;
		}
		return null;
	}

	public NonRootModelElement getRequiredModelElement(NonRootModelElement modelElement) {
		if (modelElement instanceof StateMachineState_c) {
			Action_c source = Action_c.getOneSM_ACTOnR514(ActionHome_c
					.getOneSM_AHOnR513(MooreActionHome_c.getOneSM_MOAHOnR511((StateMachineState_c) modelElement)));
			if (source != null) {
				return source;
			}
		} else if (modelElement instanceof Transition_c) {
			Action_c source = Action_c.getOneSM_ACTOnR514(ActionHome_c
					.getOneSM_AHOnR513(TransitionActionHome_c.getOneSM_TAHOnR530((Transition_c) modelElement)));
			if (source != null) {
				return source;
			}
		} else if (modelElement instanceof CreationTransition_c) {
			Action_c source = Action_c.getOneSM_ACTOnR514(ActionHome_c.getOneSM_AHOnR513(TransitionActionHome_c
					.getOneSM_TAHOnR530(Transition_c.getOneSM_TXNOnR507((CreationTransition_c) modelElement))));
			if (source != null) {
				return source;
			}
		} else if (modelElement instanceof Attribute_c) {
			DerivedBaseAttribute_c source = DerivedBaseAttribute_c
					.getOneO_DBATTROnR107(BaseAttribute_c.getOneO_BATTROnR106((Attribute_c) modelElement));
			if (source != null) {
				return source;
			}
		} else if (getSupportedModelElementList().contains(modelElement.getClass().getName())) {
			return modelElement;
		}
		return null;
	}

	static ASLActivityEditorInputFactory defaultInstance;

	public static ASLActivityEditorInputFactory getDefaultInstance() {
		if (defaultInstance == null) {
			defaultInstance = new ASLActivityEditorInputFactory();
		}
		return defaultInstance;
	}
}
