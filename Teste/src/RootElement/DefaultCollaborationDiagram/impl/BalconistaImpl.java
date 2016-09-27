/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.Balconista;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balconista</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BalconistaImpl extends CompradeRefrigeranteImpl implements Balconista {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BalconistaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultCollaborationDiagramPackage.Literals.BALCONISTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void EntregarRefrigerante() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void VerificarDisponibilidade() {
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
			case DefaultCollaborationDiagramPackage.BALCONISTA___ENTREGAR_REFRIGERANTE:
				EntregarRefrigerante();
				return null;
			case DefaultCollaborationDiagramPackage.BALCONISTA___VERIFICAR_DISPONIBILIDADE:
				VerificarDisponibilidade();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BalconistaImpl
