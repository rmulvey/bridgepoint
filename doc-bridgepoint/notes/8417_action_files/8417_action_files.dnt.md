---

This work is licensed under the Creative Commons CC0 License

---

# Storing Action Semantics as Files
### xtUML Project Design Note

1. Abstract
-----------

See [[2.2]](#2.2) section 1

2. Document References
----------------------
<a id="2.1"></a>2.1 [Parent issue #8417](https://support.onefact.net/issues/8417)  

<a id="2.2"></a>2.2 [Parent issue analysis note](8417_action_files.ant.md)  

<a id="2.3"></a>2.3 [Multi-buffer editor issue](https://support.onefact.net/issues/1087)

<a id="2.4"></a>2.4 [Multi-buffer editor analysis note](dts0100601533.ant)

<a id="2.5"></a>2.5 [Multi-buffer editor design note](dts0100601533.dnt)

<a id="2.6"></a>2.6 [Auto-complete editor issue](https://support.onefact.net/issues/506)

<a id="2.7"></a>2.7 [Auto-complete editor analysis note](../506_enhanced_oal_editor/506_enhanced_oal_editor.ant.md)

<a id="2.8"></a>2.8 [Rename refactoring editor issue](https://support.onefact.net/issues/7964)

<a id="2.9"></a>2.9 [Rename refactoring editor analysis note](../7964_analysis_of_text_editor_cross_references/7964_analysis_of_text_editor_cross_references.ant.md)

3. Background
-------------

See [[2.2]](#2.2) section 3

4. Requirements
---------------

See [[2.2]](#2.2) section 4

5. Analysis
-----------

See [[2.2]](#2.2) section 5

5.1 `Action_Semantics` at the modeling level

There are a handful of accesses of `Action_Semantics` at the xtUML modeling
level. These are in functions to get connector text for state machine
transitions, get compartment text for state machine states, and removing
annotations from the `Action_Semantics_internal` field. It has become clear that
the dependence on `Action_Semantics` at the modeling level is small, and should
be moved to the Java level.

5.2 Multi-buffer editor with signature editing

As a future enhancement we would like to see a multi-buffer editor with
signature editing as analyzed in [[2.4]](#2.4). We have determined that the work
required for this additional set of requirements can be tackled separately.
There are clear benefits to solving both problems at once -- so that users can
avoid more than one serious upgrade to their models. However, due to the volume
of work required and the immediate benefits of moving to files, we have decided
to pursue them as separate issues.

6. Design
---------

6.1 `Action_Semantics` and `Action_Semantics_internal` removal

The `Action_Semantics` and `Action_Semantics_internal` fields will be removed
from the xtUML meta-model.

6.2 `AbstractModelElementFileEditorInput`

The editor input class we currently are using to pass input to our text editor
is `AbstractModelElementPropertyEditorInput`, which creates a placeholder file
and persists the action semantics string in the meta-model. A new class
`AbstractModelElementFileEditorInput` will be created, being backed by an actual
file.

6.2.1 Naming

We will leverage the existing model element name getter functions and place the
files in the same directory as the corresponding persistable component. This
will provide the least resistance and allow us to defer the naming question to
the future multi-buffer feature.

6.2.2 Upgrade

We will implement a helper function as part of the BridgePoint model import
flow. This function will check for existing `Action_Semantics` fields and create
and populate backing files for the actions. Note that this does not imply that
files will be created on the file system. They will remain abstract in the
eclipse virtual file system until a save is initiated, at which point the files
will be written to disk. Note that this upgrade takes place at the granularity
of an `.xtuml` file, therefore, if a user dirties and saves one function in a
package, files will be created for each sibling function in the package.

6.2.2.1 Complete convert

When a model is imported, BridgePoint will show a dialog notifying the user that
his model contains `Action_Semantics` fields. The dialog will give the option to
convert the model or ignore, and allow the user to check a box to ignore future
warnings. The complete convert will leverage the load and persist feature to
upgrade the models all at once.

6.2.3 The future, indexing, and `Action_Semantics_internal`

The `Action_Semantics_internal` field is annotated specially with IDs and used
to locate referred model elements. We have discussed using a different scheme
for indexing, however, that discussion is out of the scope of this work. For the
time being, the design will continue to support two flavors of the action
semantics, a user facing and an internal flavor, however the user facing will
continue to be the only flavor saved on disk.

6.3 Getters and setters

New getters and setters for the action semantics will go through the editor
input class and will be implemented in the `NonRootModelElement` class.

6.4 Move, copy/paste, rename, delete

Because we are operating on a naming convention, when the name or location of
a model element is changed, the file name and path must be updated accordingly.
We will implement mechanisms in each of these paths to hook into the editor
input and adjust the backing file accordingly.

6.5 Recognizing an element with actions

As well as storing the action string, `Action_Semantics` is used as a flag to
easily identify an actionable model element. This pattern is used in code
generation for various purposes, such as which elements have an OAL editor CME.
A helper function will be created in the archetypes to replace this pattern,
based on the existence of an association with _Body_ (ACT_ACT).

7. Design Comments
------------------
None.

8. Unit Test
------------
See [[2.2]](#2.2) section 7

End
---

