/**
 */
package RootElement.DefaultCollaborationDiagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Default Collaboration Diagram'"
 * @generated
 */
public interface DefaultCollaborationDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DefaultCollaborationDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/DefaultCollaborationDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.DefaultCollaborationDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DefaultCollaborationDiagramPackage eINSTANCE = RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.CompradeRefrigeranteImpl <em>Comprade Refrigerante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.CompradeRefrigeranteImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCompradeRefrigerante()
	 * @generated
	 */
	int COMPRADE_REFRIGERANTE = 0;

	/**
	 * The number of structural features of the '<em>Comprade Refrigerante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRADE_REFRIGERANTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comprade Refrigerante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRADE_REFRIGERANTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.BalconistaImpl <em>Balconista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.BalconistaImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getBalconista()
	 * @generated
	 */
	int BALCONISTA = 1;

	/**
	 * The number of structural features of the '<em>Balconista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONISTA_FEATURE_COUNT = COMPRADE_REFRIGERANTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Entregar Refrigerante</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONISTA___ENTREGAR_REFRIGERANTE = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Verificar Disponibilidade</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONISTA___VERIFICAR_DISPONIBILIDADE = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Balconista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALCONISTA_OPERATION_COUNT = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service <em>Refrigerante Indisponivel Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteIndisponivel_Service()
	 * @generated
	 */
	int REFRIGERANTE_INDISPONIVEL_SERVICE = 2;

	/**
	 * The number of structural features of the '<em>Refrigerante Indisponivel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_INDISPONIVEL_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refrigerante Indisponivel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_INDISPONIVEL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request <em>Refrigerante Indisponivel Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteIndisponivel_Request()
	 * @generated
	 */
	int REFRIGERANTE_INDISPONIVEL_REQUEST = 3;

	/**
	 * The number of structural features of the '<em>Refrigerante Indisponivel Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_INDISPONIVEL_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refrigerante Indisponivel Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_INDISPONIVEL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Fim_Service <em>Fim Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Fim_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getFim_Service()
	 * @generated
	 */
	int FIM_SERVICE = 4;

	/**
	 * The number of structural features of the '<em>Fim Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIM_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fim Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIM_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Fim_Request <em>Fim Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Fim_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getFim_Request()
	 * @generated
	 */
	int FIM_REQUEST = 5;

	/**
	 * The number of structural features of the '<em>Fim Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIM_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fim Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIM_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request <em>Verificar Disponibilidade Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDisponibilidade_Request()
	 * @generated
	 */
	int VERIFICAR_DISPONIBILIDADE_REQUEST = 6;

	/**
	 * The number of structural features of the '<em>Verificar Disponibilidade Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DISPONIBILIDADE_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Verificar Disponibilidade Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DISPONIBILIDADE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service <em>Verificar Dinheiro Disponivel Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDinheiroDisponivel_Service()
	 * @generated
	 */
	int VERIFICAR_DINHEIRO_DISPONIVEL_SERVICE = 7;

	/**
	 * The number of structural features of the '<em>Verificar Dinheiro Disponivel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DINHEIRO_DISPONIVEL_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Verificar Dinheiro Disponivel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DINHEIRO_DISPONIVEL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service <em>Refrigerante Disponivel Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteDisponivel_Service()
	 * @generated
	 */
	int REFRIGERANTE_DISPONIVEL_SERVICE = 8;

	/**
	 * The number of structural features of the '<em>Refrigerante Disponivel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_DISPONIVEL_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refrigerante Disponivel Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_DISPONIVEL_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request <em>Refrigerante Disponivel Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteDisponivel_Request()
	 * @generated
	 */
	int REFRIGERANTE_DISPONIVEL_REQUEST = 9;

	/**
	 * The number of structural features of the '<em>Refrigerante Disponivel Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_DISPONIVEL_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Refrigerante Disponivel Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFRIGERANTE_DISPONIVEL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request <em>Entregar Refrigerante Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getEntregarRefrigerante_Request()
	 * @generated
	 */
	int ENTREGAR_REFRIGERANTE_REQUEST = 10;

	/**
	 * The number of structural features of the '<em>Entregar Refrigerante Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREGAR_REFRIGERANTE_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entregar Refrigerante Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREGAR_REFRIGERANTE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.ClienteImpl <em>Cliente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.ClienteImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCliente()
	 * @generated
	 */
	int CLIENTE = 11;

	/**
	 * The number of structural features of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_FEATURE_COUNT = COMPRADE_REFRIGERANTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Realizar Pagamento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___REALIZAR_PAGAMENTO = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Solicitar Refrigerante</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___SOLICITAR_REFRIGERANTE = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Verificar Dinheiro Disponivel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE___VERIFICAR_DINHEIRO_DISPONIVEL = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cliente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENTE_OPERATION_COUNT = COMPRADE_REFRIGERANTE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service <em>Verificar Disponibilidade Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDisponibilidade_Service()
	 * @generated
	 */
	int VERIFICAR_DISPONIBILIDADE_SERVICE = 12;

	/**
	 * The number of structural features of the '<em>Verificar Disponibilidade Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DISPONIBILIDADE_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Verificar Disponibilidade Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DISPONIBILIDADE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service <em>Solicitar Refrigerante Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitarRefrigerante_Service()
	 * @generated
	 */
	int SOLICITAR_REFRIGERANTE_SERVICE = 13;

	/**
	 * The number of structural features of the '<em>Solicitar Refrigerante Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITAR_REFRIGERANTE_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitar Refrigerante Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITAR_REFRIGERANTE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request <em>Solicitar Refrigerante Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitarRefrigerante_Request()
	 * @generated
	 */
	int SOLICITAR_REFRIGERANTE_REQUEST = 14;

	/**
	 * The number of structural features of the '<em>Solicitar Refrigerante Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITAR_REFRIGERANTE_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitar Refrigerante Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITAR_REFRIGERANTE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request <em>Verificar Dinheiro Disponivel Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDinheiroDisponivel_Request()
	 * @generated
	 */
	int VERIFICAR_DINHEIRO_DISPONIVEL_REQUEST = 15;

	/**
	 * The number of structural features of the '<em>Verificar Dinheiro Disponivel Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DINHEIRO_DISPONIVEL_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Verificar Dinheiro Disponivel Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAR_DINHEIRO_DISPONIVEL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service <em>Pagamentonaorealizado Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPagamentonaorealizado_Service()
	 * @generated
	 */
	int PAGAMENTONAOREALIZADO_SERVICE = 16;

	/**
	 * The number of structural features of the '<em>Pagamentonaorealizado Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGAMENTONAOREALIZADO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pagamentonaorealizado Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGAMENTONAOREALIZADO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request <em>Pagamentonaorealizado Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPagamentonaorealizado_Request()
	 * @generated
	 */
	int PAGAMENTONAOREALIZADO_REQUEST = 17;

	/**
	 * The number of structural features of the '<em>Pagamentonaorealizado Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGAMENTONAOREALIZADO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pagamentonaorealizado Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGAMENTONAOREALIZADO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service <em>Possui Dinheiro Suficiente Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPossuiDinheiroSuficiente_Service()
	 * @generated
	 */
	int POSSUI_DINHEIRO_SUFICIENTE_SERVICE = 18;

	/**
	 * The number of structural features of the '<em>Possui Dinheiro Suficiente Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSUI_DINHEIRO_SUFICIENTE_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Possui Dinheiro Suficiente Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSUI_DINHEIRO_SUFICIENTE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request <em>Possui Dinheiro Suficiente Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPossuiDinheiroSuficiente_Request()
	 * @generated
	 */
	int POSSUI_DINHEIRO_SUFICIENTE_REQUEST = 19;

	/**
	 * The number of structural features of the '<em>Possui Dinheiro Suficiente Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSUI_DINHEIRO_SUFICIENTE_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Possui Dinheiro Suficiente Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSUI_DINHEIRO_SUFICIENTE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service <em>Entregar Refrigerante Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getEntregarRefrigerante_Service()
	 * @generated
	 */
	int ENTREGAR_REFRIGERANTE_SERVICE = 20;

	/**
	 * The number of structural features of the '<em>Entregar Refrigerante Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREGAR_REFRIGERANTE_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entregar Refrigerante Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREGAR_REFRIGERANTE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service <em>Realizar Pagamento Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRealizarPagamento_Service()
	 * @generated
	 */
	int REALIZAR_PAGAMENTO_SERVICE = 21;

	/**
	 * The number of structural features of the '<em>Realizar Pagamento Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZAR_PAGAMENTO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Realizar Pagamento Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZAR_PAGAMENTO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request <em>Realizar Pagamento Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRealizarPagamento_Request()
	 * @generated
	 */
	int REALIZAR_PAGAMENTO_REQUEST = 22;

	/**
	 * The number of structural features of the '<em>Realizar Pagamento Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZAR_PAGAMENTO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Realizar Pagamento Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZAR_PAGAMENTO_REQUEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.CompradeRefrigerante <em>Comprade Refrigerante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comprade Refrigerante</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.CompradeRefrigerante
	 * @generated
	 */
	EClass getCompradeRefrigerante();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Balconista <em>Balconista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balconista</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Balconista
	 * @generated
	 */
	EClass getBalconista();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Balconista#EntregarRefrigerante() <em>Entregar Refrigerante</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entregar Refrigerante</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Balconista#EntregarRefrigerante()
	 * @generated
	 */
	EOperation getBalconista__EntregarRefrigerante();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Balconista#VerificarDisponibilidade() <em>Verificar Disponibilidade</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verificar Disponibilidade</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Balconista#VerificarDisponibilidade()
	 * @generated
	 */
	EOperation getBalconista__VerificarDisponibilidade();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service <em>Refrigerante Indisponivel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refrigerante Indisponivel Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service
	 * @generated
	 */
	EClass getRefrigeranteIndisponivel_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request <em>Refrigerante Indisponivel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refrigerante Indisponivel Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request
	 * @generated
	 */
	EClass getRefrigeranteIndisponivel_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Fim_Service <em>Fim Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fim Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Fim_Service
	 * @generated
	 */
	EClass getFim_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Fim_Request <em>Fim Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fim Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Fim_Request
	 * @generated
	 */
	EClass getFim_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request <em>Verificar Disponibilidade Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verificar Disponibilidade Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request
	 * @generated
	 */
	EClass getVerificarDisponibilidade_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service <em>Verificar Dinheiro Disponivel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verificar Dinheiro Disponivel Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service
	 * @generated
	 */
	EClass getVerificarDinheiroDisponivel_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service <em>Refrigerante Disponivel Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refrigerante Disponivel Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service
	 * @generated
	 */
	EClass getRefrigeranteDisponivel_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request <em>Refrigerante Disponivel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refrigerante Disponivel Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request
	 * @generated
	 */
	EClass getRefrigeranteDisponivel_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request <em>Entregar Refrigerante Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entregar Refrigerante Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request
	 * @generated
	 */
	EClass getEntregarRefrigerante_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Cliente <em>Cliente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliente</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Cliente
	 * @generated
	 */
	EClass getCliente();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Cliente#RealizarPagamento() <em>Realizar Pagamento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Realizar Pagamento</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Cliente#RealizarPagamento()
	 * @generated
	 */
	EOperation getCliente__RealizarPagamento();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Cliente#SolicitarRefrigerante() <em>Solicitar Refrigerante</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solicitar Refrigerante</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Cliente#SolicitarRefrigerante()
	 * @generated
	 */
	EOperation getCliente__SolicitarRefrigerante();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Cliente#VerificarDinheiroDisponivel() <em>Verificar Dinheiro Disponivel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verificar Dinheiro Disponivel</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Cliente#VerificarDinheiroDisponivel()
	 * @generated
	 */
	EOperation getCliente__VerificarDinheiroDisponivel();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service <em>Verificar Disponibilidade Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verificar Disponibilidade Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service
	 * @generated
	 */
	EClass getVerificarDisponibilidade_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service <em>Solicitar Refrigerante Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitar Refrigerante Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service
	 * @generated
	 */
	EClass getSolicitarRefrigerante_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request <em>Solicitar Refrigerante Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitar Refrigerante Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request
	 * @generated
	 */
	EClass getSolicitarRefrigerante_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request <em>Verificar Dinheiro Disponivel Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verificar Dinheiro Disponivel Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request
	 * @generated
	 */
	EClass getVerificarDinheiroDisponivel_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service <em>Pagamentonaorealizado Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagamentonaorealizado Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service
	 * @generated
	 */
	EClass getPagamentonaorealizado_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request <em>Pagamentonaorealizado Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagamentonaorealizado Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request
	 * @generated
	 */
	EClass getPagamentonaorealizado_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service <em>Possui Dinheiro Suficiente Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possui Dinheiro Suficiente Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service
	 * @generated
	 */
	EClass getPossuiDinheiroSuficiente_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request <em>Possui Dinheiro Suficiente Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possui Dinheiro Suficiente Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request
	 * @generated
	 */
	EClass getPossuiDinheiroSuficiente_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service <em>Entregar Refrigerante Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entregar Refrigerante Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service
	 * @generated
	 */
	EClass getEntregarRefrigerante_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service <em>Realizar Pagamento Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizar Pagamento Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service
	 * @generated
	 */
	EClass getRealizarPagamento_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request <em>Realizar Pagamento Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realizar Pagamento Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request
	 * @generated
	 */
	EClass getRealizarPagamento_Request();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DefaultCollaborationDiagramFactory getDefaultCollaborationDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.CompradeRefrigeranteImpl <em>Comprade Refrigerante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.CompradeRefrigeranteImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCompradeRefrigerante()
		 * @generated
		 */
		EClass COMPRADE_REFRIGERANTE = eINSTANCE.getCompradeRefrigerante();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.BalconistaImpl <em>Balconista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.BalconistaImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getBalconista()
		 * @generated
		 */
		EClass BALCONISTA = eINSTANCE.getBalconista();

		/**
		 * The meta object literal for the '<em><b>Entregar Refrigerante</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BALCONISTA___ENTREGAR_REFRIGERANTE = eINSTANCE.getBalconista__EntregarRefrigerante();

		/**
		 * The meta object literal for the '<em><b>Verificar Disponibilidade</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BALCONISTA___VERIFICAR_DISPONIBILIDADE = eINSTANCE.getBalconista__VerificarDisponibilidade();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service <em>Refrigerante Indisponivel Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteIndisponivel_Service()
		 * @generated
		 */
		EClass REFRIGERANTE_INDISPONIVEL_SERVICE = eINSTANCE.getRefrigeranteIndisponivel_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request <em>Refrigerante Indisponivel Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteIndisponivel_Request()
		 * @generated
		 */
		EClass REFRIGERANTE_INDISPONIVEL_REQUEST = eINSTANCE.getRefrigeranteIndisponivel_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Fim_Service <em>Fim Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Fim_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getFim_Service()
		 * @generated
		 */
		EClass FIM_SERVICE = eINSTANCE.getFim_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Fim_Request <em>Fim Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Fim_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getFim_Request()
		 * @generated
		 */
		EClass FIM_REQUEST = eINSTANCE.getFim_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request <em>Verificar Disponibilidade Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDisponibilidade_Request()
		 * @generated
		 */
		EClass VERIFICAR_DISPONIBILIDADE_REQUEST = eINSTANCE.getVerificarDisponibilidade_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service <em>Verificar Dinheiro Disponivel Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDinheiroDisponivel_Service()
		 * @generated
		 */
		EClass VERIFICAR_DINHEIRO_DISPONIVEL_SERVICE = eINSTANCE.getVerificarDinheiroDisponivel_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service <em>Refrigerante Disponivel Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteDisponivel_Service()
		 * @generated
		 */
		EClass REFRIGERANTE_DISPONIVEL_SERVICE = eINSTANCE.getRefrigeranteDisponivel_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request <em>Refrigerante Disponivel Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRefrigeranteDisponivel_Request()
		 * @generated
		 */
		EClass REFRIGERANTE_DISPONIVEL_REQUEST = eINSTANCE.getRefrigeranteDisponivel_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request <em>Entregar Refrigerante Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getEntregarRefrigerante_Request()
		 * @generated
		 */
		EClass ENTREGAR_REFRIGERANTE_REQUEST = eINSTANCE.getEntregarRefrigerante_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.ClienteImpl <em>Cliente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.ClienteImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCliente()
		 * @generated
		 */
		EClass CLIENTE = eINSTANCE.getCliente();

		/**
		 * The meta object literal for the '<em><b>Realizar Pagamento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___REALIZAR_PAGAMENTO = eINSTANCE.getCliente__RealizarPagamento();

		/**
		 * The meta object literal for the '<em><b>Solicitar Refrigerante</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___SOLICITAR_REFRIGERANTE = eINSTANCE.getCliente__SolicitarRefrigerante();

		/**
		 * The meta object literal for the '<em><b>Verificar Dinheiro Disponivel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLIENTE___VERIFICAR_DINHEIRO_DISPONIVEL = eINSTANCE.getCliente__VerificarDinheiroDisponivel();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service <em>Verificar Disponibilidade Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDisponibilidade_Service()
		 * @generated
		 */
		EClass VERIFICAR_DISPONIBILIDADE_SERVICE = eINSTANCE.getVerificarDisponibilidade_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service <em>Solicitar Refrigerante Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitarRefrigerante_Service()
		 * @generated
		 */
		EClass SOLICITAR_REFRIGERANTE_SERVICE = eINSTANCE.getSolicitarRefrigerante_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request <em>Solicitar Refrigerante Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitarRefrigerante_Request()
		 * @generated
		 */
		EClass SOLICITAR_REFRIGERANTE_REQUEST = eINSTANCE.getSolicitarRefrigerante_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request <em>Verificar Dinheiro Disponivel Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getVerificarDinheiroDisponivel_Request()
		 * @generated
		 */
		EClass VERIFICAR_DINHEIRO_DISPONIVEL_REQUEST = eINSTANCE.getVerificarDinheiroDisponivel_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service <em>Pagamentonaorealizado Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPagamentonaorealizado_Service()
		 * @generated
		 */
		EClass PAGAMENTONAOREALIZADO_SERVICE = eINSTANCE.getPagamentonaorealizado_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request <em>Pagamentonaorealizado Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPagamentonaorealizado_Request()
		 * @generated
		 */
		EClass PAGAMENTONAOREALIZADO_REQUEST = eINSTANCE.getPagamentonaorealizado_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service <em>Possui Dinheiro Suficiente Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPossuiDinheiroSuficiente_Service()
		 * @generated
		 */
		EClass POSSUI_DINHEIRO_SUFICIENTE_SERVICE = eINSTANCE.getPossuiDinheiroSuficiente_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request <em>Possui Dinheiro Suficiente Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getPossuiDinheiroSuficiente_Request()
		 * @generated
		 */
		EClass POSSUI_DINHEIRO_SUFICIENTE_REQUEST = eINSTANCE.getPossuiDinheiroSuficiente_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service <em>Entregar Refrigerante Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getEntregarRefrigerante_Service()
		 * @generated
		 */
		EClass ENTREGAR_REFRIGERANTE_SERVICE = eINSTANCE.getEntregarRefrigerante_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service <em>Realizar Pagamento Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRealizarPagamento_Service()
		 * @generated
		 */
		EClass REALIZAR_PAGAMENTO_SERVICE = eINSTANCE.getRealizarPagamento_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request <em>Realizar Pagamento Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getRealizarPagamento_Request()
		 * @generated
		 */
		EClass REALIZAR_PAGAMENTO_REQUEST = eINSTANCE.getRealizarPagamento_Request();

	}

} //DefaultCollaborationDiagramPackage
