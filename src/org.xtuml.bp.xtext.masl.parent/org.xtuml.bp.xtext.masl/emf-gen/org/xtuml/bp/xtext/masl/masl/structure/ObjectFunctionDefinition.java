/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#isInstance <em>Instance</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition()
 * @model
 * @generated
 */
public interface ObjectFunctionDefinition extends AbstractActionDefinition, AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(boolean)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Instance()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInstance();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#isInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #isInstance()
	 * @generated
	 */
	void setInstance(boolean value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(RelationshipDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Relationship()
	 * @model
	 * @generated
	 */
	RelationshipDefinition getRelationship();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipDefinition value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ObjectDeclaration)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getObjectFunctionDefinition_Object()
	 * @model
	 * @generated
	 */
	ObjectDeclaration getObject();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.ObjectFunctionDefinition#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectDeclaration value);

} // ObjectFunctionDefinition
