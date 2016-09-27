/**
 */
package RootElement.DefaultCollaborationDiagram.util;

import RootElement.DefaultCollaborationDiagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage
 * @generated
 */
public class DefaultCollaborationDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DefaultCollaborationDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCollaborationDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DefaultCollaborationDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultCollaborationDiagramSwitch<Adapter> modelSwitch =
		new DefaultCollaborationDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseCompradeRefrigerante(CompradeRefrigerante object) {
				return createCompradeRefrigeranteAdapter();
			}
			@Override
			public Adapter caseBalconista(Balconista object) {
				return createBalconistaAdapter();
			}
			@Override
			public Adapter caseRefrigeranteIndisponivel_Service(RefrigeranteIndisponivel_Service object) {
				return createRefrigeranteIndisponivel_ServiceAdapter();
			}
			@Override
			public Adapter caseRefrigeranteIndisponivel_Request(RefrigeranteIndisponivel_Request object) {
				return createRefrigeranteIndisponivel_RequestAdapter();
			}
			@Override
			public Adapter caseFim_Service(Fim_Service object) {
				return createFim_ServiceAdapter();
			}
			@Override
			public Adapter caseFim_Request(Fim_Request object) {
				return createFim_RequestAdapter();
			}
			@Override
			public Adapter caseVerificarDisponibilidade_Request(VerificarDisponibilidade_Request object) {
				return createVerificarDisponibilidade_RequestAdapter();
			}
			@Override
			public Adapter caseVerificarDinheiroDisponivel_Service(VerificarDinheiroDisponivel_Service object) {
				return createVerificarDinheiroDisponivel_ServiceAdapter();
			}
			@Override
			public Adapter caseRefrigeranteDisponivel_Service(RefrigeranteDisponivel_Service object) {
				return createRefrigeranteDisponivel_ServiceAdapter();
			}
			@Override
			public Adapter caseRefrigeranteDisponivel_Request(RefrigeranteDisponivel_Request object) {
				return createRefrigeranteDisponivel_RequestAdapter();
			}
			@Override
			public Adapter caseEntregarRefrigerante_Request(EntregarRefrigerante_Request object) {
				return createEntregarRefrigerante_RequestAdapter();
			}
			@Override
			public Adapter caseCliente(Cliente object) {
				return createClienteAdapter();
			}
			@Override
			public Adapter caseVerificarDisponibilidade_Service(VerificarDisponibilidade_Service object) {
				return createVerificarDisponibilidade_ServiceAdapter();
			}
			@Override
			public Adapter caseSolicitarRefrigerante_Service(SolicitarRefrigerante_Service object) {
				return createSolicitarRefrigerante_ServiceAdapter();
			}
			@Override
			public Adapter caseSolicitarRefrigerante_Request(SolicitarRefrigerante_Request object) {
				return createSolicitarRefrigerante_RequestAdapter();
			}
			@Override
			public Adapter caseVerificarDinheiroDisponivel_Request(VerificarDinheiroDisponivel_Request object) {
				return createVerificarDinheiroDisponivel_RequestAdapter();
			}
			@Override
			public Adapter casePagamentonaorealizado_Service(Pagamentonaorealizado_Service object) {
				return createPagamentonaorealizado_ServiceAdapter();
			}
			@Override
			public Adapter casePagamentonaorealizado_Request(Pagamentonaorealizado_Request object) {
				return createPagamentonaorealizado_RequestAdapter();
			}
			@Override
			public Adapter casePossuiDinheiroSuficiente_Service(PossuiDinheiroSuficiente_Service object) {
				return createPossuiDinheiroSuficiente_ServiceAdapter();
			}
			@Override
			public Adapter casePossuiDinheiroSuficiente_Request(PossuiDinheiroSuficiente_Request object) {
				return createPossuiDinheiroSuficiente_RequestAdapter();
			}
			@Override
			public Adapter caseEntregarRefrigerante_Service(EntregarRefrigerante_Service object) {
				return createEntregarRefrigerante_ServiceAdapter();
			}
			@Override
			public Adapter caseRealizarPagamento_Service(RealizarPagamento_Service object) {
				return createRealizarPagamento_ServiceAdapter();
			}
			@Override
			public Adapter caseRealizarPagamento_Request(RealizarPagamento_Request object) {
				return createRealizarPagamento_RequestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.CompradeRefrigerante <em>Comprade Refrigerante</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.CompradeRefrigerante
	 * @generated
	 */
	public Adapter createCompradeRefrigeranteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Balconista <em>Balconista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Balconista
	 * @generated
	 */
	public Adapter createBalconistaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service <em>Refrigerante Indisponivel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service
	 * @generated
	 */
	public Adapter createRefrigeranteIndisponivel_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request <em>Refrigerante Indisponivel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request
	 * @generated
	 */
	public Adapter createRefrigeranteIndisponivel_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Fim_Service <em>Fim Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Fim_Service
	 * @generated
	 */
	public Adapter createFim_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Fim_Request <em>Fim Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Fim_Request
	 * @generated
	 */
	public Adapter createFim_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request <em>Verificar Disponibilidade Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request
	 * @generated
	 */
	public Adapter createVerificarDisponibilidade_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service <em>Verificar Dinheiro Disponivel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service
	 * @generated
	 */
	public Adapter createVerificarDinheiroDisponivel_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service <em>Refrigerante Disponivel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service
	 * @generated
	 */
	public Adapter createRefrigeranteDisponivel_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request <em>Refrigerante Disponivel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request
	 * @generated
	 */
	public Adapter createRefrigeranteDisponivel_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request <em>Entregar Refrigerante Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request
	 * @generated
	 */
	public Adapter createEntregarRefrigerante_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Cliente
	 * @generated
	 */
	public Adapter createClienteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service <em>Verificar Disponibilidade Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service
	 * @generated
	 */
	public Adapter createVerificarDisponibilidade_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service <em>Solicitar Refrigerante Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service
	 * @generated
	 */
	public Adapter createSolicitarRefrigerante_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request <em>Solicitar Refrigerante Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request
	 * @generated
	 */
	public Adapter createSolicitarRefrigerante_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request <em>Verificar Dinheiro Disponivel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request
	 * @generated
	 */
	public Adapter createVerificarDinheiroDisponivel_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service <em>Pagamentonaorealizado Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service
	 * @generated
	 */
	public Adapter createPagamentonaorealizado_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request <em>Pagamentonaorealizado Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request
	 * @generated
	 */
	public Adapter createPagamentonaorealizado_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service <em>Possui Dinheiro Suficiente Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service
	 * @generated
	 */
	public Adapter createPossuiDinheiroSuficiente_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request <em>Possui Dinheiro Suficiente Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request
	 * @generated
	 */
	public Adapter createPossuiDinheiroSuficiente_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service <em>Entregar Refrigerante Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service
	 * @generated
	 */
	public Adapter createEntregarRefrigerante_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service <em>Realizar Pagamento Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service
	 * @generated
	 */
	public Adapter createRealizarPagamento_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request <em>Realizar Pagamento Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request
	 * @generated
	 */
	public Adapter createRealizarPagamento_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DefaultCollaborationDiagramAdapterFactory
