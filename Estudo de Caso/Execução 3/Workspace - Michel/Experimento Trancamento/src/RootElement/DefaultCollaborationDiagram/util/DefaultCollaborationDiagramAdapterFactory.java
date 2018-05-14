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
			public Adapter caseIES(IES object) {
				return createIESAdapter();
			}
			@Override
			public Adapter caseDiscente(Discente object) {
				return createDiscenteAdapter();
			}
			@Override
			public Adapter caseTempodecorridodadisciplinapassou50_Request(Tempodecorridodadisciplinapassou50_Request object) {
				return createTempodecorridodadisciplinapassou50_RequestAdapter();
			}
			@Override
			public Adapter caseAl_Request(Al_Request object) {
				return createAl_RequestAdapter();
			}
			@Override
			public Adapter caseSolicitartrancamento_Service(Solicitartrancamento_Service object) {
				return createSolicitartrancamento_ServiceAdapter();
			}
			@Override
			public Adapter caseSolicitartrancamento_Request(Solicitartrancamento_Request object) {
				return createSolicitartrancamento_RequestAdapter();
			}
			@Override
			public Adapter caseAlunonaoeativoounaoeformando_Request(Alunonaoeativoounaoeformando_Request object) {
				return createAlunonaoeativoounaoeformando_RequestAdapter();
			}
			@Override
			public Adapter caseSistema(Sistema object) {
				return createSistemaAdapter();
			}
			@Override
			public Adapter caseverificaaluno_Service(verificaaluno_Service object) {
				return createverificaaluno_ServiceAdapter();
			}
			@Override
			public Adapter caseOalunoestaemobservacao_Request(Oalunoestaemobservacao_Request object) {
				return createOalunoestaemobservacao_RequestAdapter();
			}
			@Override
			public Adapter caseSolicitacaoaprovada_Service(Solicitacaoaprovada_Service object) {
				return createSolicitacaoaprovada_ServiceAdapter();
			}
			@Override
			public Adapter caseSolicitacaoaprovada_Request(Solicitacaoaprovada_Request object) {
				return createSolicitacaoaprovada_RequestAdapter();
			}
			@Override
			public Adapter caseTempodecorrido_Service(Tempodecorrido_Service object) {
				return createTempodecorrido_ServiceAdapter();
			}
			@Override
			public Adapter caseAlunostrictusensu_Request(Alunostrictusensu_Request object) {
				return createAlunostrictusensu_RequestAdapter();
			}
			@Override
			public Adapter caseAnalisarsolicitacao_Service(Analisarsolicitacao_Service object) {
				return createAnalisarsolicitacao_ServiceAdapter();
			}
			@Override
			public Adapter caseAlunoeativoeformando_Request(Alunoeativoeformando_Request object) {
				return createAlunoeativoeformando_RequestAdapter();
			}
			@Override
			public Adapter caseQuantidadedetrancamentos_Service(Quantidadedetrancamentos_Service object) {
				return createQuantidadedetrancamentos_ServiceAdapter();
			}
			@Override
			public Adapter caseAlunodegraduacao_Request(Alunodegraduacao_Request object) {
				return createAlunodegraduacao_RequestAdapter();
			}
			@Override
			public Adapter caseAguardarsetediaseefetivartrancamento_Service(Aguardarsetediaseefetivartrancamento_Service object) {
				return createAguardarsetediaseefetivartrancamento_ServiceAdapter();
			}
			@Override
			public Adapter caseAguardarsetediaseefetivartrancamento_Request(Aguardarsetediaseefetivartrancamento_Request object) {
				return createAguardarsetediaseefetivartrancamento_RequestAdapter();
			}
			@Override
			public Adapter caseTempodecorridodadisciplinaemenorque50_Request(Tempodecorridodadisciplinaemenorque50_Request object) {
				return createTempodecorridodadisciplinaemenorque50_RequestAdapter();
			}
			@Override
			public Adapter caseCoordenadordoCurso(CoordenadordoCurso object) {
				return createCoordenadordoCursoAdapter();
			}
			@Override
			public Adapter casesolitacaodeferida_Service(solitacaodeferida_Service object) {
				return createsolitacaodeferida_ServiceAdapter();
			}
			@Override
			public Adapter casesolitacaodeferida_Request(solitacaodeferida_Request object) {
				return createsolitacaodeferida_RequestAdapter();
			}
			@Override
			public Adapter caseCancelarsolicitacao_Service(Cancelarsolicitacao_Service object) {
				return createCancelarsolicitacao_ServiceAdapter();
			}
			@Override
			public Adapter caseCancelarsolicitacao_Request(Cancelarsolicitacao_Request object) {
				return createCancelarsolicitacao_RequestAdapter();
			}
			@Override
			public Adapter caseAnalisarsolicitacao_Request(Analisarsolicitacao_Request object) {
				return createAnalisarsolicitacao_RequestAdapter();
			}
			@Override
			public Adapter caseSolicitacaocancelada_Service(Solicitacaocancelada_Service object) {
				return createSolicitacaocancelada_ServiceAdapter();
			}
			@Override
			public Adapter caseSolicitacaocancelada_Request(Solicitacaocancelada_Request object) {
				return createSolicitacaocancelada_RequestAdapter();
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
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.IES <em>IES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.IES
	 * @generated
	 */
	public Adapter createIESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Discente <em>Discente</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Discente
	 * @generated
	 */
	public Adapter createDiscenteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request <em>Tempodecorridodadisciplinapassou50 Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request
	 * @generated
	 */
	public Adapter createTempodecorridodadisciplinapassou50_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Al_Request <em>Al Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Al_Request
	 * @generated
	 */
	public Adapter createAl_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service <em>Solicitartrancamento Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service
	 * @generated
	 */
	public Adapter createSolicitartrancamento_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request <em>Solicitartrancamento Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request
	 * @generated
	 */
	public Adapter createSolicitartrancamento_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request <em>Alunonaoeativoounaoeformando Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request
	 * @generated
	 */
	public Adapter createAlunonaoeativoounaoeformando_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Sistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema
	 * @generated
	 */
	public Adapter createSistemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.verificaaluno_Service <em>verificaaluno Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.verificaaluno_Service
	 * @generated
	 */
	public Adapter createverificaaluno_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request <em>Oalunoestaemobservacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request
	 * @generated
	 */
	public Adapter createOalunoestaemobservacao_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service <em>Solicitacaoaprovada Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service
	 * @generated
	 */
	public Adapter createSolicitacaoaprovada_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request <em>Solicitacaoaprovada Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request
	 * @generated
	 */
	public Adapter createSolicitacaoaprovada_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service <em>Tempodecorrido Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service
	 * @generated
	 */
	public Adapter createTempodecorrido_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request <em>Alunostrictusensu Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request
	 * @generated
	 */
	public Adapter createAlunostrictusensu_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service <em>Analisarsolicitacao Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service
	 * @generated
	 */
	public Adapter createAnalisarsolicitacao_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request <em>Alunoeativoeformando Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request
	 * @generated
	 */
	public Adapter createAlunoeativoeformando_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service <em>Quantidadedetrancamentos Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service
	 * @generated
	 */
	public Adapter createQuantidadedetrancamentos_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request <em>Alunodegraduacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request
	 * @generated
	 */
	public Adapter createAlunodegraduacao_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service <em>Aguardarsetediaseefetivartrancamento Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service
	 * @generated
	 */
	public Adapter createAguardarsetediaseefetivartrancamento_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request <em>Aguardarsetediaseefetivartrancamento Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request
	 * @generated
	 */
	public Adapter createAguardarsetediaseefetivartrancamento_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request <em>Tempodecorridodadisciplinaemenorque50 Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request
	 * @generated
	 */
	public Adapter createTempodecorridodadisciplinaemenorque50_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.CoordenadordoCurso <em>Coordenadordo Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.CoordenadordoCurso
	 * @generated
	 */
	public Adapter createCoordenadordoCursoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service <em>solitacaodeferida Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service
	 * @generated
	 */
	public Adapter createsolitacaodeferida_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request <em>solitacaodeferida Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request
	 * @generated
	 */
	public Adapter createsolitacaodeferida_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service <em>Cancelarsolicitacao Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service
	 * @generated
	 */
	public Adapter createCancelarsolicitacao_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request <em>Cancelarsolicitacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request
	 * @generated
	 */
	public Adapter createCancelarsolicitacao_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request <em>Analisarsolicitacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request
	 * @generated
	 */
	public Adapter createAnalisarsolicitacao_RequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service <em>Solicitacaocancelada Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service
	 * @generated
	 */
	public Adapter createSolicitacaocancelada_ServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request <em>Solicitacaocancelada Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request
	 * @generated
	 */
	public Adapter createSolicitacaocancelada_RequestAdapter() {
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
