/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;

import org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigate Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getWhere <em>Where</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getWith <em>With</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getReverseOrder <em>Reverse Order</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression()
 * @model
 * @generated
 */
public interface NavigateExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Navigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation</em>' containment reference.
	 * @see #setNavigation(RelationshipNavigation)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression_Navigation()
	 * @model containment="true"
	 * @generated
	 */
	RelationshipNavigation getNavigation();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getNavigation <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation</em>' containment reference.
	 * @see #getNavigation()
	 * @generated
	 */
	void setNavigation(RelationshipNavigation value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference.
	 * @see #setWith(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression_With()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWith();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getWith <em>With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' containment reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(Expression value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(SortOrder)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression_Order()
	 * @model containment="true"
	 * @generated
	 */
	SortOrder getOrder();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(SortOrder value);

	/**
	 * Returns the value of the '<em><b>Reverse Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Order</em>' containment reference.
	 * @see #setReverseOrder(SortOrder)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getNavigateExpression_ReverseOrder()
	 * @model containment="true"
	 * @generated
	 */
	SortOrder getReverseOrder();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.NavigateExpression#getReverseOrder <em>Reverse Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Order</em>' containment reference.
	 * @see #getReverseOrder()
	 * @generated
	 */
	void setReverseOrder(SortOrder value);

} // NavigateExpression
