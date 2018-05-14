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
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.IESImpl <em>IES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.IESImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getIES()
	 * @generated
	 */
	int IES = 0;

	/**
	 * The number of structural features of the '<em>IES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.DiscenteImpl <em>Discente</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.DiscenteImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getDiscente()
	 * @generated
	 */
	int DISCENTE = 1;

	/**
	 * The number of structural features of the '<em>Discente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCENTE_FEATURE_COUNT = IES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Solicitartrancamento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCENTE___SOLICITARTRANCAMENTO = IES_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discente</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCENTE_OPERATION_COUNT = IES_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request <em>Tempodecorridodadisciplinapassou50 Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getTempodecorridodadisciplinapassou50_Request()
	 * @generated
	 */
	int TEMPODECORRIDODADISCIPLINAPASSOU50_REQUEST = 2;

	/**
	 * The number of structural features of the '<em>Tempodecorridodadisciplinapassou50 Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPODECORRIDODADISCIPLINAPASSOU50_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tempodecorridodadisciplinapassou50 Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPODECORRIDODADISCIPLINAPASSOU50_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Al_Request <em>Al Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Al_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAl_Request()
	 * @generated
	 */
	int AL_REQUEST = 3;

	/**
	 * The number of structural features of the '<em>Al Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AL_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Al Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service <em>Solicitartrancamento Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitartrancamento_Service()
	 * @generated
	 */
	int SOLICITARTRANCAMENTO_SERVICE = 4;

	/**
	 * The number of structural features of the '<em>Solicitartrancamento Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITARTRANCAMENTO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitartrancamento Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITARTRANCAMENTO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request <em>Solicitartrancamento Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitartrancamento_Request()
	 * @generated
	 */
	int SOLICITARTRANCAMENTO_REQUEST = 5;

	/**
	 * The number of structural features of the '<em>Solicitartrancamento Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITARTRANCAMENTO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitartrancamento Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITARTRANCAMENTO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request <em>Alunonaoeativoounaoeformando Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunonaoeativoounaoeformando_Request()
	 * @generated
	 */
	int ALUNONAOEATIVOOUNAOEFORMANDO_REQUEST = 6;

	/**
	 * The number of structural features of the '<em>Alunonaoeativoounaoeformando Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNONAOEATIVOOUNAOEFORMANDO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Alunonaoeativoounaoeformando Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNONAOEATIVOOUNAOEFORMANDO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.SistemaImpl <em>Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.SistemaImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSistema()
	 * @generated
	 */
	int SISTEMA = 7;

	/**
	 * The number of structural features of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_FEATURE_COUNT = DISCENTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Solicitartrancamento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___SOLICITARTRANCAMENTO = DISCENTE___SOLICITARTRANCAMENTO;

	/**
	 * The operation id for the '<em>Verificasealunodiscenteeformando</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___VERIFICASEALUNODISCENTEEFORMANDO = DISCENTE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Aguardarsetediaseefetivartrancamento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___AGUARDARSETEDIASEEFETIVARTRANCAMENTO = DISCENTE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Verificatempodecorrido</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___VERIFICATEMPODECORRIDO = DISCENTE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Recuperaalunonosistema</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___RECUPERAALUNONOSISTEMA = DISCENTE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Verificarquantidadedetrancamentos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA___VERIFICARQUANTIDADEDETRANCAMENTOS = DISCENTE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATION_COUNT = DISCENTE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.verificaaluno_Service <em>verificaaluno Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.verificaaluno_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getverificaaluno_Service()
	 * @generated
	 */
	int VERIFICAALUNO_SERVICE = 8;

	/**
	 * The number of structural features of the '<em>verificaaluno Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAALUNO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>verificaaluno Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICAALUNO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request <em>Oalunoestaemobservacao Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getOalunoestaemobservacao_Request()
	 * @generated
	 */
	int OALUNOESTAEMOBSERVACAO_REQUEST = 9;

	/**
	 * The number of structural features of the '<em>Oalunoestaemobservacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OALUNOESTAEMOBSERVACAO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Oalunoestaemobservacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OALUNOESTAEMOBSERVACAO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service <em>Solicitacaoaprovada Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaoaprovada_Service()
	 * @generated
	 */
	int SOLICITACAOAPROVADA_SERVICE = 10;

	/**
	 * The number of structural features of the '<em>Solicitacaoaprovada Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOAPROVADA_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitacaoaprovada Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOAPROVADA_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request <em>Solicitacaoaprovada Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaoaprovada_Request()
	 * @generated
	 */
	int SOLICITACAOAPROVADA_REQUEST = 11;

	/**
	 * The number of structural features of the '<em>Solicitacaoaprovada Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOAPROVADA_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitacaoaprovada Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOAPROVADA_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service <em>Tempodecorrido Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getTempodecorrido_Service()
	 * @generated
	 */
	int TEMPODECORRIDO_SERVICE = 12;

	/**
	 * The number of structural features of the '<em>Tempodecorrido Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPODECORRIDO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tempodecorrido Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPODECORRIDO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request <em>Alunostrictusensu Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunostrictusensu_Request()
	 * @generated
	 */
	int ALUNOSTRICTUSENSU_REQUEST = 13;

	/**
	 * The number of structural features of the '<em>Alunostrictusensu Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNOSTRICTUSENSU_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Alunostrictusensu Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNOSTRICTUSENSU_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service <em>Analisarsolicitacao Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAnalisarsolicitacao_Service()
	 * @generated
	 */
	int ANALISARSOLICITACAO_SERVICE = 14;

	/**
	 * The number of structural features of the '<em>Analisarsolicitacao Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISARSOLICITACAO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Analisarsolicitacao Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISARSOLICITACAO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request <em>Alunoeativoeformando Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunoeativoeformando_Request()
	 * @generated
	 */
	int ALUNOEATIVOEFORMANDO_REQUEST = 15;

	/**
	 * The number of structural features of the '<em>Alunoeativoeformando Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNOEATIVOEFORMANDO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Alunoeativoeformando Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNOEATIVOEFORMANDO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service <em>Quantidadedetrancamentos Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getQuantidadedetrancamentos_Service()
	 * @generated
	 */
	int QUANTIDADEDETRANCAMENTOS_SERVICE = 16;

	/**
	 * The number of structural features of the '<em>Quantidadedetrancamentos Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIDADEDETRANCAMENTOS_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Quantidadedetrancamentos Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIDADEDETRANCAMENTOS_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request <em>Alunodegraduacao Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunodegraduacao_Request()
	 * @generated
	 */
	int ALUNODEGRADUACAO_REQUEST = 17;

	/**
	 * The number of structural features of the '<em>Alunodegraduacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNODEGRADUACAO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Alunodegraduacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNODEGRADUACAO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service <em>Aguardarsetediaseefetivartrancamento Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAguardarsetediaseefetivartrancamento_Service()
	 * @generated
	 */
	int AGUARDARSETEDIASEEFETIVARTRANCAMENTO_SERVICE = 18;

	/**
	 * The number of structural features of the '<em>Aguardarsetediaseefetivartrancamento Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUARDARSETEDIASEEFETIVARTRANCAMENTO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Aguardarsetediaseefetivartrancamento Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUARDARSETEDIASEEFETIVARTRANCAMENTO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request <em>Aguardarsetediaseefetivartrancamento Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAguardarsetediaseefetivartrancamento_Request()
	 * @generated
	 */
	int AGUARDARSETEDIASEEFETIVARTRANCAMENTO_REQUEST = 19;

	/**
	 * The number of structural features of the '<em>Aguardarsetediaseefetivartrancamento Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUARDARSETEDIASEEFETIVARTRANCAMENTO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Aguardarsetediaseefetivartrancamento Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGUARDARSETEDIASEEFETIVARTRANCAMENTO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request <em>Tempodecorridodadisciplinaemenorque50 Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getTempodecorridodadisciplinaemenorque50_Request()
	 * @generated
	 */
	int TEMPODECORRIDODADISCIPLINAEMENORQUE50_REQUEST = 20;

	/**
	 * The number of structural features of the '<em>Tempodecorridodadisciplinaemenorque50 Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPODECORRIDODADISCIPLINAEMENORQUE50_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tempodecorridodadisciplinaemenorque50 Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPODECORRIDODADISCIPLINAEMENORQUE50_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.impl.CoordenadordoCursoImpl <em>Coordenadordo Curso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.impl.CoordenadordoCursoImpl
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCoordenadordoCurso()
	 * @generated
	 */
	int COORDENADORDO_CURSO = 21;

	/**
	 * The number of structural features of the '<em>Coordenadordo Curso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADORDO_CURSO_FEATURE_COUNT = IES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Analisarsolicitacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADORDO_CURSO___ANALISARSOLICITACAO = IES_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cancelarsolicitacao</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADORDO_CURSO___CANCELARSOLICITACAO = IES_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coordenadordo Curso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDENADORDO_CURSO_OPERATION_COUNT = IES_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service <em>solitacaodeferida Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getsolitacaodeferida_Service()
	 * @generated
	 */
	int SOLITACAODEFERIDA_SERVICE = 22;

	/**
	 * The number of structural features of the '<em>solitacaodeferida Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITACAODEFERIDA_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>solitacaodeferida Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITACAODEFERIDA_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request <em>solitacaodeferida Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getsolitacaodeferida_Request()
	 * @generated
	 */
	int SOLITACAODEFERIDA_REQUEST = 23;

	/**
	 * The number of structural features of the '<em>solitacaodeferida Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITACAODEFERIDA_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>solitacaodeferida Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLITACAODEFERIDA_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service <em>Cancelarsolicitacao Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCancelarsolicitacao_Service()
	 * @generated
	 */
	int CANCELARSOLICITACAO_SERVICE = 24;

	/**
	 * The number of structural features of the '<em>Cancelarsolicitacao Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELARSOLICITACAO_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cancelarsolicitacao Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELARSOLICITACAO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request <em>Cancelarsolicitacao Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCancelarsolicitacao_Request()
	 * @generated
	 */
	int CANCELARSOLICITACAO_REQUEST = 25;

	/**
	 * The number of structural features of the '<em>Cancelarsolicitacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELARSOLICITACAO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Cancelarsolicitacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELARSOLICITACAO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request <em>Analisarsolicitacao Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAnalisarsolicitacao_Request()
	 * @generated
	 */
	int ANALISARSOLICITACAO_REQUEST = 26;

	/**
	 * The number of structural features of the '<em>Analisarsolicitacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISARSOLICITACAO_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Analisarsolicitacao Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALISARSOLICITACAO_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service <em>Solicitacaocancelada Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaocancelada_Service()
	 * @generated
	 */
	int SOLICITACAOCANCELADA_SERVICE = 27;

	/**
	 * The number of structural features of the '<em>Solicitacaocancelada Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOCANCELADA_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitacaocancelada Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOCANCELADA_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request <em>Solicitacaocancelada Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request
	 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaocancelada_Request()
	 * @generated
	 */
	int SOLICITACAOCANCELADA_REQUEST = 28;

	/**
	 * The number of structural features of the '<em>Solicitacaocancelada Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOCANCELADA_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Solicitacaocancelada Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLICITACAOCANCELADA_REQUEST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.IES <em>IES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IES</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.IES
	 * @generated
	 */
	EClass getIES();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Discente <em>Discente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discente</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Discente
	 * @generated
	 */
	EClass getDiscente();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Discente#Solicitartrancamento() <em>Solicitartrancamento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Solicitartrancamento</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Discente#Solicitartrancamento()
	 * @generated
	 */
	EOperation getDiscente__Solicitartrancamento();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request <em>Tempodecorridodadisciplinapassou50 Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tempodecorridodadisciplinapassou50 Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request
	 * @generated
	 */
	EClass getTempodecorridodadisciplinapassou50_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Al_Request <em>Al Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Al Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Al_Request
	 * @generated
	 */
	EClass getAl_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service <em>Solicitartrancamento Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitartrancamento Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service
	 * @generated
	 */
	EClass getSolicitartrancamento_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request <em>Solicitartrancamento Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitartrancamento Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request
	 * @generated
	 */
	EClass getSolicitartrancamento_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request <em>Alunonaoeativoounaoeformando Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alunonaoeativoounaoeformando Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request
	 * @generated
	 */
	EClass getAlunonaoeativoounaoeformando_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Sistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema
	 * @generated
	 */
	EClass getSistema();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Sistema#Verificasealunodiscenteeformando() <em>Verificasealunodiscenteeformando</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verificasealunodiscenteeformando</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema#Verificasealunodiscenteeformando()
	 * @generated
	 */
	EOperation getSistema__Verificasealunodiscenteeformando();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Sistema#Aguardarsetediaseefetivartrancamento() <em>Aguardarsetediaseefetivartrancamento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Aguardarsetediaseefetivartrancamento</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema#Aguardarsetediaseefetivartrancamento()
	 * @generated
	 */
	EOperation getSistema__Aguardarsetediaseefetivartrancamento();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Sistema#Verificatempodecorrido() <em>Verificatempodecorrido</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verificatempodecorrido</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema#Verificatempodecorrido()
	 * @generated
	 */
	EOperation getSistema__Verificatempodecorrido();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Sistema#Recuperaalunonosistema() <em>Recuperaalunonosistema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recuperaalunonosistema</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema#Recuperaalunonosistema()
	 * @generated
	 */
	EOperation getSistema__Recuperaalunonosistema();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.Sistema#Verificarquantidadedetrancamentos() <em>Verificarquantidadedetrancamentos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verificarquantidadedetrancamentos</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.Sistema#Verificarquantidadedetrancamentos()
	 * @generated
	 */
	EOperation getSistema__Verificarquantidadedetrancamentos();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.verificaaluno_Service <em>verificaaluno Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>verificaaluno Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.verificaaluno_Service
	 * @generated
	 */
	EClass getverificaaluno_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request <em>Oalunoestaemobservacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oalunoestaemobservacao Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request
	 * @generated
	 */
	EClass getOalunoestaemobservacao_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service <em>Solicitacaoaprovada Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitacaoaprovada Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service
	 * @generated
	 */
	EClass getSolicitacaoaprovada_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request <em>Solicitacaoaprovada Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitacaoaprovada Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request
	 * @generated
	 */
	EClass getSolicitacaoaprovada_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service <em>Tempodecorrido Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tempodecorrido Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service
	 * @generated
	 */
	EClass getTempodecorrido_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request <em>Alunostrictusensu Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alunostrictusensu Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request
	 * @generated
	 */
	EClass getAlunostrictusensu_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service <em>Analisarsolicitacao Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analisarsolicitacao Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service
	 * @generated
	 */
	EClass getAnalisarsolicitacao_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request <em>Alunoeativoeformando Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alunoeativoeformando Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request
	 * @generated
	 */
	EClass getAlunoeativoeformando_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service <em>Quantidadedetrancamentos Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantidadedetrancamentos Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service
	 * @generated
	 */
	EClass getQuantidadedetrancamentos_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request <em>Alunodegraduacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alunodegraduacao Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request
	 * @generated
	 */
	EClass getAlunodegraduacao_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service <em>Aguardarsetediaseefetivartrancamento Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aguardarsetediaseefetivartrancamento Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service
	 * @generated
	 */
	EClass getAguardarsetediaseefetivartrancamento_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request <em>Aguardarsetediaseefetivartrancamento Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aguardarsetediaseefetivartrancamento Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request
	 * @generated
	 */
	EClass getAguardarsetediaseefetivartrancamento_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request <em>Tempodecorridodadisciplinaemenorque50 Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tempodecorridodadisciplinaemenorque50 Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request
	 * @generated
	 */
	EClass getTempodecorridodadisciplinaemenorque50_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.CoordenadordoCurso <em>Coordenadordo Curso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordenadordo Curso</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.CoordenadordoCurso
	 * @generated
	 */
	EClass getCoordenadordoCurso();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.CoordenadordoCurso#Analisarsolicitacao() <em>Analisarsolicitacao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analisarsolicitacao</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.CoordenadordoCurso#Analisarsolicitacao()
	 * @generated
	 */
	EOperation getCoordenadordoCurso__Analisarsolicitacao();

	/**
	 * Returns the meta object for the '{@link RootElement.DefaultCollaborationDiagram.CoordenadordoCurso#Cancelarsolicitacao() <em>Cancelarsolicitacao</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelarsolicitacao</em>' operation.
	 * @see RootElement.DefaultCollaborationDiagram.CoordenadordoCurso#Cancelarsolicitacao()
	 * @generated
	 */
	EOperation getCoordenadordoCurso__Cancelarsolicitacao();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service <em>solitacaodeferida Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>solitacaodeferida Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service
	 * @generated
	 */
	EClass getsolitacaodeferida_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request <em>solitacaodeferida Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>solitacaodeferida Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request
	 * @generated
	 */
	EClass getsolitacaodeferida_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service <em>Cancelarsolicitacao Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancelarsolicitacao Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service
	 * @generated
	 */
	EClass getCancelarsolicitacao_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request <em>Cancelarsolicitacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancelarsolicitacao Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request
	 * @generated
	 */
	EClass getCancelarsolicitacao_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request <em>Analisarsolicitacao Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analisarsolicitacao Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request
	 * @generated
	 */
	EClass getAnalisarsolicitacao_Request();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service <em>Solicitacaocancelada Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitacaocancelada Service</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service
	 * @generated
	 */
	EClass getSolicitacaocancelada_Service();

	/**
	 * Returns the meta object for class '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request <em>Solicitacaocancelada Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solicitacaocancelada Request</em>'.
	 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request
	 * @generated
	 */
	EClass getSolicitacaocancelada_Request();

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
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.IESImpl <em>IES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.IESImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getIES()
		 * @generated
		 */
		EClass IES = eINSTANCE.getIES();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.DiscenteImpl <em>Discente</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.DiscenteImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getDiscente()
		 * @generated
		 */
		EClass DISCENTE = eINSTANCE.getDiscente();

		/**
		 * The meta object literal for the '<em><b>Solicitartrancamento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCENTE___SOLICITARTRANCAMENTO = eINSTANCE.getDiscente__Solicitartrancamento();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request <em>Tempodecorridodadisciplinapassou50 Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getTempodecorridodadisciplinapassou50_Request()
		 * @generated
		 */
		EClass TEMPODECORRIDODADISCIPLINAPASSOU50_REQUEST = eINSTANCE.getTempodecorridodadisciplinapassou50_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Al_Request <em>Al Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Al_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAl_Request()
		 * @generated
		 */
		EClass AL_REQUEST = eINSTANCE.getAl_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service <em>Solicitartrancamento Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitartrancamento_Service()
		 * @generated
		 */
		EClass SOLICITARTRANCAMENTO_SERVICE = eINSTANCE.getSolicitartrancamento_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request <em>Solicitartrancamento Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitartrancamento_Request()
		 * @generated
		 */
		EClass SOLICITARTRANCAMENTO_REQUEST = eINSTANCE.getSolicitartrancamento_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request <em>Alunonaoeativoounaoeformando Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunonaoeativoounaoeformando_Request()
		 * @generated
		 */
		EClass ALUNONAOEATIVOOUNAOEFORMANDO_REQUEST = eINSTANCE.getAlunonaoeativoounaoeformando_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.SistemaImpl <em>Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.SistemaImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSistema()
		 * @generated
		 */
		EClass SISTEMA = eINSTANCE.getSistema();

		/**
		 * The meta object literal for the '<em><b>Verificasealunodiscenteeformando</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA___VERIFICASEALUNODISCENTEEFORMANDO = eINSTANCE.getSistema__Verificasealunodiscenteeformando();

		/**
		 * The meta object literal for the '<em><b>Aguardarsetediaseefetivartrancamento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA___AGUARDARSETEDIASEEFETIVARTRANCAMENTO = eINSTANCE.getSistema__Aguardarsetediaseefetivartrancamento();

		/**
		 * The meta object literal for the '<em><b>Verificatempodecorrido</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA___VERIFICATEMPODECORRIDO = eINSTANCE.getSistema__Verificatempodecorrido();

		/**
		 * The meta object literal for the '<em><b>Recuperaalunonosistema</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA___RECUPERAALUNONOSISTEMA = eINSTANCE.getSistema__Recuperaalunonosistema();

		/**
		 * The meta object literal for the '<em><b>Verificarquantidadedetrancamentos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SISTEMA___VERIFICARQUANTIDADEDETRANCAMENTOS = eINSTANCE.getSistema__Verificarquantidadedetrancamentos();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.verificaaluno_Service <em>verificaaluno Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.verificaaluno_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getverificaaluno_Service()
		 * @generated
		 */
		EClass VERIFICAALUNO_SERVICE = eINSTANCE.getverificaaluno_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request <em>Oalunoestaemobservacao Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getOalunoestaemobservacao_Request()
		 * @generated
		 */
		EClass OALUNOESTAEMOBSERVACAO_REQUEST = eINSTANCE.getOalunoestaemobservacao_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service <em>Solicitacaoaprovada Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaoaprovada_Service()
		 * @generated
		 */
		EClass SOLICITACAOAPROVADA_SERVICE = eINSTANCE.getSolicitacaoaprovada_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request <em>Solicitacaoaprovada Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaoaprovada_Request()
		 * @generated
		 */
		EClass SOLICITACAOAPROVADA_REQUEST = eINSTANCE.getSolicitacaoaprovada_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service <em>Tempodecorrido Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getTempodecorrido_Service()
		 * @generated
		 */
		EClass TEMPODECORRIDO_SERVICE = eINSTANCE.getTempodecorrido_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request <em>Alunostrictusensu Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunostrictusensu_Request()
		 * @generated
		 */
		EClass ALUNOSTRICTUSENSU_REQUEST = eINSTANCE.getAlunostrictusensu_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service <em>Analisarsolicitacao Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAnalisarsolicitacao_Service()
		 * @generated
		 */
		EClass ANALISARSOLICITACAO_SERVICE = eINSTANCE.getAnalisarsolicitacao_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request <em>Alunoeativoeformando Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunoeativoeformando_Request()
		 * @generated
		 */
		EClass ALUNOEATIVOEFORMANDO_REQUEST = eINSTANCE.getAlunoeativoeformando_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service <em>Quantidadedetrancamentos Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getQuantidadedetrancamentos_Service()
		 * @generated
		 */
		EClass QUANTIDADEDETRANCAMENTOS_SERVICE = eINSTANCE.getQuantidadedetrancamentos_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request <em>Alunodegraduacao Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAlunodegraduacao_Request()
		 * @generated
		 */
		EClass ALUNODEGRADUACAO_REQUEST = eINSTANCE.getAlunodegraduacao_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service <em>Aguardarsetediaseefetivartrancamento Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAguardarsetediaseefetivartrancamento_Service()
		 * @generated
		 */
		EClass AGUARDARSETEDIASEEFETIVARTRANCAMENTO_SERVICE = eINSTANCE.getAguardarsetediaseefetivartrancamento_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request <em>Aguardarsetediaseefetivartrancamento Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAguardarsetediaseefetivartrancamento_Request()
		 * @generated
		 */
		EClass AGUARDARSETEDIASEEFETIVARTRANCAMENTO_REQUEST = eINSTANCE.getAguardarsetediaseefetivartrancamento_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request <em>Tempodecorridodadisciplinaemenorque50 Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getTempodecorridodadisciplinaemenorque50_Request()
		 * @generated
		 */
		EClass TEMPODECORRIDODADISCIPLINAEMENORQUE50_REQUEST = eINSTANCE.getTempodecorridodadisciplinaemenorque50_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.impl.CoordenadordoCursoImpl <em>Coordenadordo Curso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.impl.CoordenadordoCursoImpl
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCoordenadordoCurso()
		 * @generated
		 */
		EClass COORDENADORDO_CURSO = eINSTANCE.getCoordenadordoCurso();

		/**
		 * The meta object literal for the '<em><b>Analisarsolicitacao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COORDENADORDO_CURSO___ANALISARSOLICITACAO = eINSTANCE.getCoordenadordoCurso__Analisarsolicitacao();

		/**
		 * The meta object literal for the '<em><b>Cancelarsolicitacao</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COORDENADORDO_CURSO___CANCELARSOLICITACAO = eINSTANCE.getCoordenadordoCurso__Cancelarsolicitacao();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service <em>solitacaodeferida Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getsolitacaodeferida_Service()
		 * @generated
		 */
		EClass SOLITACAODEFERIDA_SERVICE = eINSTANCE.getsolitacaodeferida_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request <em>solitacaodeferida Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getsolitacaodeferida_Request()
		 * @generated
		 */
		EClass SOLITACAODEFERIDA_REQUEST = eINSTANCE.getsolitacaodeferida_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service <em>Cancelarsolicitacao Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCancelarsolicitacao_Service()
		 * @generated
		 */
		EClass CANCELARSOLICITACAO_SERVICE = eINSTANCE.getCancelarsolicitacao_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request <em>Cancelarsolicitacao Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getCancelarsolicitacao_Request()
		 * @generated
		 */
		EClass CANCELARSOLICITACAO_REQUEST = eINSTANCE.getCancelarsolicitacao_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request <em>Analisarsolicitacao Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getAnalisarsolicitacao_Request()
		 * @generated
		 */
		EClass ANALISARSOLICITACAO_REQUEST = eINSTANCE.getAnalisarsolicitacao_Request();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service <em>Solicitacaocancelada Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaocancelada_Service()
		 * @generated
		 */
		EClass SOLICITACAOCANCELADA_SERVICE = eINSTANCE.getSolicitacaocancelada_Service();

		/**
		 * The meta object literal for the '{@link RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request <em>Solicitacaocancelada Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request
		 * @see RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramPackageImpl#getSolicitacaocancelada_Request()
		 * @generated
		 */
		EClass SOLICITACAOCANCELADA_REQUEST = eINSTANCE.getSolicitacaocancelada_Request();

	}

} //DefaultCollaborationDiagramPackage
