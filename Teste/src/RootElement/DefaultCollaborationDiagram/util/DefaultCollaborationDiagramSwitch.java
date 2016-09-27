/**
 */
package RootElement.DefaultCollaborationDiagram.util;

import RootElement.DefaultCollaborationDiagram.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage
 * @generated
 */
public class DefaultCollaborationDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DefaultCollaborationDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCollaborationDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = DefaultCollaborationDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DefaultCollaborationDiagramPackage.COMPRADE_REFRIGERANTE: {
				CompradeRefrigerante compradeRefrigerante = (CompradeRefrigerante)theEObject;
				T result = caseCompradeRefrigerante(compradeRefrigerante);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.BALCONISTA: {
				Balconista balconista = (Balconista)theEObject;
				T result = caseBalconista(balconista);
				if (result == null) result = caseCompradeRefrigerante(balconista);
				if (result == null) result = caseRefrigeranteIndisponivel_Service(balconista);
				if (result == null) result = caseRefrigeranteIndisponivel_Request(balconista);
				if (result == null) result = caseFim_Service(balconista);
				if (result == null) result = caseFim_Request(balconista);
				if (result == null) result = caseVerificarDisponibilidade_Request(balconista);
				if (result == null) result = caseVerificarDinheiroDisponivel_Service(balconista);
				if (result == null) result = caseRefrigeranteDisponivel_Service(balconista);
				if (result == null) result = caseRefrigeranteDisponivel_Request(balconista);
				if (result == null) result = caseEntregarRefrigerante_Request(balconista);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.REFRIGERANTE_INDISPONIVEL_SERVICE: {
				RefrigeranteIndisponivel_Service refrigeranteIndisponivel_Service = (RefrigeranteIndisponivel_Service)theEObject;
				T result = caseRefrigeranteIndisponivel_Service(refrigeranteIndisponivel_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.REFRIGERANTE_INDISPONIVEL_REQUEST: {
				RefrigeranteIndisponivel_Request refrigeranteIndisponivel_Request = (RefrigeranteIndisponivel_Request)theEObject;
				T result = caseRefrigeranteIndisponivel_Request(refrigeranteIndisponivel_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.FIM_SERVICE: {
				Fim_Service fim_Service = (Fim_Service)theEObject;
				T result = caseFim_Service(fim_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.FIM_REQUEST: {
				Fim_Request fim_Request = (Fim_Request)theEObject;
				T result = caseFim_Request(fim_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.VERIFICAR_DISPONIBILIDADE_REQUEST: {
				VerificarDisponibilidade_Request verificarDisponibilidade_Request = (VerificarDisponibilidade_Request)theEObject;
				T result = caseVerificarDisponibilidade_Request(verificarDisponibilidade_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.VERIFICAR_DINHEIRO_DISPONIVEL_SERVICE: {
				VerificarDinheiroDisponivel_Service verificarDinheiroDisponivel_Service = (VerificarDinheiroDisponivel_Service)theEObject;
				T result = caseVerificarDinheiroDisponivel_Service(verificarDinheiroDisponivel_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.REFRIGERANTE_DISPONIVEL_SERVICE: {
				RefrigeranteDisponivel_Service refrigeranteDisponivel_Service = (RefrigeranteDisponivel_Service)theEObject;
				T result = caseRefrigeranteDisponivel_Service(refrigeranteDisponivel_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.REFRIGERANTE_DISPONIVEL_REQUEST: {
				RefrigeranteDisponivel_Request refrigeranteDisponivel_Request = (RefrigeranteDisponivel_Request)theEObject;
				T result = caseRefrigeranteDisponivel_Request(refrigeranteDisponivel_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ENTREGAR_REFRIGERANTE_REQUEST: {
				EntregarRefrigerante_Request entregarRefrigerante_Request = (EntregarRefrigerante_Request)theEObject;
				T result = caseEntregarRefrigerante_Request(entregarRefrigerante_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.CLIENTE: {
				Cliente cliente = (Cliente)theEObject;
				T result = caseCliente(cliente);
				if (result == null) result = caseCompradeRefrigerante(cliente);
				if (result == null) result = caseVerificarDisponibilidade_Service(cliente);
				if (result == null) result = caseSolicitarRefrigerante_Service(cliente);
				if (result == null) result = caseSolicitarRefrigerante_Request(cliente);
				if (result == null) result = caseVerificarDinheiroDisponivel_Request(cliente);
				if (result == null) result = casePagamentonaorealizado_Service(cliente);
				if (result == null) result = casePagamentonaorealizado_Request(cliente);
				if (result == null) result = casePossuiDinheiroSuficiente_Service(cliente);
				if (result == null) result = casePossuiDinheiroSuficiente_Request(cliente);
				if (result == null) result = caseEntregarRefrigerante_Service(cliente);
				if (result == null) result = caseRealizarPagamento_Service(cliente);
				if (result == null) result = caseRealizarPagamento_Request(cliente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.VERIFICAR_DISPONIBILIDADE_SERVICE: {
				VerificarDisponibilidade_Service verificarDisponibilidade_Service = (VerificarDisponibilidade_Service)theEObject;
				T result = caseVerificarDisponibilidade_Service(verificarDisponibilidade_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITAR_REFRIGERANTE_SERVICE: {
				SolicitarRefrigerante_Service solicitarRefrigerante_Service = (SolicitarRefrigerante_Service)theEObject;
				T result = caseSolicitarRefrigerante_Service(solicitarRefrigerante_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITAR_REFRIGERANTE_REQUEST: {
				SolicitarRefrigerante_Request solicitarRefrigerante_Request = (SolicitarRefrigerante_Request)theEObject;
				T result = caseSolicitarRefrigerante_Request(solicitarRefrigerante_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.VERIFICAR_DINHEIRO_DISPONIVEL_REQUEST: {
				VerificarDinheiroDisponivel_Request verificarDinheiroDisponivel_Request = (VerificarDinheiroDisponivel_Request)theEObject;
				T result = caseVerificarDinheiroDisponivel_Request(verificarDinheiroDisponivel_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.PAGAMENTONAOREALIZADO_SERVICE: {
				Pagamentonaorealizado_Service pagamentonaorealizado_Service = (Pagamentonaorealizado_Service)theEObject;
				T result = casePagamentonaorealizado_Service(pagamentonaorealizado_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.PAGAMENTONAOREALIZADO_REQUEST: {
				Pagamentonaorealizado_Request pagamentonaorealizado_Request = (Pagamentonaorealizado_Request)theEObject;
				T result = casePagamentonaorealizado_Request(pagamentonaorealizado_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.POSSUI_DINHEIRO_SUFICIENTE_SERVICE: {
				PossuiDinheiroSuficiente_Service possuiDinheiroSuficiente_Service = (PossuiDinheiroSuficiente_Service)theEObject;
				T result = casePossuiDinheiroSuficiente_Service(possuiDinheiroSuficiente_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.POSSUI_DINHEIRO_SUFICIENTE_REQUEST: {
				PossuiDinheiroSuficiente_Request possuiDinheiroSuficiente_Request = (PossuiDinheiroSuficiente_Request)theEObject;
				T result = casePossuiDinheiroSuficiente_Request(possuiDinheiroSuficiente_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ENTREGAR_REFRIGERANTE_SERVICE: {
				EntregarRefrigerante_Service entregarRefrigerante_Service = (EntregarRefrigerante_Service)theEObject;
				T result = caseEntregarRefrigerante_Service(entregarRefrigerante_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.REALIZAR_PAGAMENTO_SERVICE: {
				RealizarPagamento_Service realizarPagamento_Service = (RealizarPagamento_Service)theEObject;
				T result = caseRealizarPagamento_Service(realizarPagamento_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.REALIZAR_PAGAMENTO_REQUEST: {
				RealizarPagamento_Request realizarPagamento_Request = (RealizarPagamento_Request)theEObject;
				T result = caseRealizarPagamento_Request(realizarPagamento_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comprade Refrigerante</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comprade Refrigerante</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompradeRefrigerante(CompradeRefrigerante object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balconista</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balconista</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalconista(Balconista object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refrigerante Indisponivel Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refrigerante Indisponivel Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefrigeranteIndisponivel_Service(RefrigeranteIndisponivel_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refrigerante Indisponivel Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refrigerante Indisponivel Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefrigeranteIndisponivel_Request(RefrigeranteIndisponivel_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fim Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fim Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFim_Service(Fim_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fim Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fim Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFim_Request(Fim_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verificar Disponibilidade Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verificar Disponibilidade Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificarDisponibilidade_Request(VerificarDisponibilidade_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verificar Dinheiro Disponivel Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verificar Dinheiro Disponivel Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificarDinheiroDisponivel_Service(VerificarDinheiroDisponivel_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refrigerante Disponivel Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refrigerante Disponivel Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefrigeranteDisponivel_Service(RefrigeranteDisponivel_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refrigerante Disponivel Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refrigerante Disponivel Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefrigeranteDisponivel_Request(RefrigeranteDisponivel_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entregar Refrigerante Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entregar Refrigerante Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntregarRefrigerante_Request(EntregarRefrigerante_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliente(Cliente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verificar Disponibilidade Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verificar Disponibilidade Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificarDisponibilidade_Service(VerificarDisponibilidade_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitar Refrigerante Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitar Refrigerante Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitarRefrigerante_Service(SolicitarRefrigerante_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitar Refrigerante Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitar Refrigerante Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitarRefrigerante_Request(SolicitarRefrigerante_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verificar Dinheiro Disponivel Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verificar Dinheiro Disponivel Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificarDinheiroDisponivel_Request(VerificarDinheiroDisponivel_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagamentonaorealizado Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagamentonaorealizado Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagamentonaorealizado_Service(Pagamentonaorealizado_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagamentonaorealizado Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagamentonaorealizado Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagamentonaorealizado_Request(Pagamentonaorealizado_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possui Dinheiro Suficiente Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possui Dinheiro Suficiente Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossuiDinheiroSuficiente_Service(PossuiDinheiroSuficiente_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Possui Dinheiro Suficiente Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Possui Dinheiro Suficiente Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePossuiDinheiroSuficiente_Request(PossuiDinheiroSuficiente_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entregar Refrigerante Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entregar Refrigerante Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntregarRefrigerante_Service(EntregarRefrigerante_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizar Pagamento Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizar Pagamento Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizarPagamento_Service(RealizarPagamento_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realizar Pagamento Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realizar Pagamento Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealizarPagamento_Request(RealizarPagamento_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DefaultCollaborationDiagramSwitch
