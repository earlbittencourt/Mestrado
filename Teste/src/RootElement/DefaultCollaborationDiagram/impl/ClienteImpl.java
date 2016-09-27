/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.Cliente;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClienteImpl extends CompradeRefrigeranteImpl implements Cliente {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClienteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultCollaborationDiagramPackage.Literals.CLIENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RealizarPagamento() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SolicitarRefrigerante() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void VerificarDinheiroDisponivel() {
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
			case DefaultCollaborationDiagramPackage.CLIENTE___REALIZAR_PAGAMENTO:
				RealizarPagamento();
				return null;
			case DefaultCollaborationDiagramPackage.CLIENTE___SOLICITAR_REFRIGERANTE:
				SolicitarRefrigerante();
				return null;
			case DefaultCollaborationDiagramPackage.CLIENTE___VERIFICAR_DINHEIRO_DISPONIVEL:
				VerificarDinheiroDisponivel();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ClienteImpl
