/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;
import RootElement.DefaultCollaborationDiagram.Discente;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discente</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DiscenteImpl extends IESImpl implements Discente {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultCollaborationDiagramPackage.Literals.DISCENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Solicitartrancamento() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DefaultCollaborationDiagramPackage.DISCENTE___SOLICITARTRANCAMENTO:
				Solicitartrancamento();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DiscenteImpl
