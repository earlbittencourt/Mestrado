/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.Balconista;
import RootElement.DefaultCollaborationDiagram.Cliente;
import RootElement.DefaultCollaborationDiagram.CompradeRefrigerante;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramFactory;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;
import RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Request;
import RootElement.DefaultCollaborationDiagram.EntregarRefrigerante_Service;
import RootElement.DefaultCollaborationDiagram.Fim_Request;
import RootElement.DefaultCollaborationDiagram.Fim_Service;
import RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Request;
import RootElement.DefaultCollaborationDiagram.Pagamentonaorealizado_Service;
import RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Request;
import RootElement.DefaultCollaborationDiagram.PossuiDinheiroSuficiente_Service;
import RootElement.DefaultCollaborationDiagram.RealizarPagamento_Request;
import RootElement.DefaultCollaborationDiagram.RealizarPagamento_Service;
import RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Request;
import RootElement.DefaultCollaborationDiagram.RefrigeranteDisponivel_Service;
import RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Request;
import RootElement.DefaultCollaborationDiagram.RefrigeranteIndisponivel_Service;
import RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Request;
import RootElement.DefaultCollaborationDiagram.SolicitarRefrigerante_Service;
import RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Request;
import RootElement.DefaultCollaborationDiagram.VerificarDinheiroDisponivel_Service;
import RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Request;
import RootElement.DefaultCollaborationDiagram.VerificarDisponibilidade_Service;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultCollaborationDiagramPackageImpl extends EPackageImpl implements DefaultCollaborationDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compradeRefrigeranteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balconistaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refrigeranteIndisponivel_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refrigeranteIndisponivel_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fim_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fim_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificarDisponibilidade_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificarDinheiroDisponivel_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refrigeranteDisponivel_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refrigeranteDisponivel_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entregarRefrigerante_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clienteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificarDisponibilidade_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitarRefrigerante_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitarRefrigerante_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificarDinheiroDisponivel_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagamentonaorealizado_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagamentonaorealizado_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possuiDinheiroSuficiente_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass possuiDinheiroSuficiente_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entregarRefrigerante_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizarPagamento_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizarPagamento_RequestEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DefaultCollaborationDiagramPackageImpl() {
		super(eNS_URI, DefaultCollaborationDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DefaultCollaborationDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DefaultCollaborationDiagramPackage init() {
		if (isInited) return (DefaultCollaborationDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DefaultCollaborationDiagramPackage.eNS_URI);

		// Obtain or create and register package
		DefaultCollaborationDiagramPackageImpl theDefaultCollaborationDiagramPackage = (DefaultCollaborationDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DefaultCollaborationDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DefaultCollaborationDiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDefaultCollaborationDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theDefaultCollaborationDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDefaultCollaborationDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DefaultCollaborationDiagramPackage.eNS_URI, theDefaultCollaborationDiagramPackage);
		return theDefaultCollaborationDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompradeRefrigerante() {
		return compradeRefrigeranteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalconista() {
		return balconistaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBalconista__EntregarRefrigerante() {
		return balconistaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBalconista__VerificarDisponibilidade() {
		return balconistaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefrigeranteIndisponivel_Service() {
		return refrigeranteIndisponivel_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefrigeranteIndisponivel_Request() {
		return refrigeranteIndisponivel_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFim_Service() {
		return fim_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFim_Request() {
		return fim_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificarDisponibilidade_Request() {
		return verificarDisponibilidade_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificarDinheiroDisponivel_Service() {
		return verificarDinheiroDisponivel_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefrigeranteDisponivel_Service() {
		return refrigeranteDisponivel_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefrigeranteDisponivel_Request() {
		return refrigeranteDisponivel_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntregarRefrigerante_Request() {
		return entregarRefrigerante_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCliente() {
		return clienteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__RealizarPagamento() {
		return clienteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__SolicitarRefrigerante() {
		return clienteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCliente__VerificarDinheiroDisponivel() {
		return clienteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificarDisponibilidade_Service() {
		return verificarDisponibilidade_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitarRefrigerante_Service() {
		return solicitarRefrigerante_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitarRefrigerante_Request() {
		return solicitarRefrigerante_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificarDinheiroDisponivel_Request() {
		return verificarDinheiroDisponivel_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagamentonaorealizado_Service() {
		return pagamentonaorealizado_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagamentonaorealizado_Request() {
		return pagamentonaorealizado_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossuiDinheiroSuficiente_Service() {
		return possuiDinheiroSuficiente_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPossuiDinheiroSuficiente_Request() {
		return possuiDinheiroSuficiente_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntregarRefrigerante_Service() {
		return entregarRefrigerante_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizarPagamento_Service() {
		return realizarPagamento_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizarPagamento_Request() {
		return realizarPagamento_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCollaborationDiagramFactory getDefaultCollaborationDiagramFactory() {
		return (DefaultCollaborationDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compradeRefrigeranteEClass = createEClass(COMPRADE_REFRIGERANTE);

		balconistaEClass = createEClass(BALCONISTA);
		createEOperation(balconistaEClass, BALCONISTA___ENTREGAR_REFRIGERANTE);
		createEOperation(balconistaEClass, BALCONISTA___VERIFICAR_DISPONIBILIDADE);

		refrigeranteIndisponivel_ServiceEClass = createEClass(REFRIGERANTE_INDISPONIVEL_SERVICE);

		refrigeranteIndisponivel_RequestEClass = createEClass(REFRIGERANTE_INDISPONIVEL_REQUEST);

		fim_ServiceEClass = createEClass(FIM_SERVICE);

		fim_RequestEClass = createEClass(FIM_REQUEST);

		verificarDisponibilidade_RequestEClass = createEClass(VERIFICAR_DISPONIBILIDADE_REQUEST);

		verificarDinheiroDisponivel_ServiceEClass = createEClass(VERIFICAR_DINHEIRO_DISPONIVEL_SERVICE);

		refrigeranteDisponivel_ServiceEClass = createEClass(REFRIGERANTE_DISPONIVEL_SERVICE);

		refrigeranteDisponivel_RequestEClass = createEClass(REFRIGERANTE_DISPONIVEL_REQUEST);

		entregarRefrigerante_RequestEClass = createEClass(ENTREGAR_REFRIGERANTE_REQUEST);

		clienteEClass = createEClass(CLIENTE);
		createEOperation(clienteEClass, CLIENTE___REALIZAR_PAGAMENTO);
		createEOperation(clienteEClass, CLIENTE___SOLICITAR_REFRIGERANTE);
		createEOperation(clienteEClass, CLIENTE___VERIFICAR_DINHEIRO_DISPONIVEL);

		verificarDisponibilidade_ServiceEClass = createEClass(VERIFICAR_DISPONIBILIDADE_SERVICE);

		solicitarRefrigerante_ServiceEClass = createEClass(SOLICITAR_REFRIGERANTE_SERVICE);

		solicitarRefrigerante_RequestEClass = createEClass(SOLICITAR_REFRIGERANTE_REQUEST);

		verificarDinheiroDisponivel_RequestEClass = createEClass(VERIFICAR_DINHEIRO_DISPONIVEL_REQUEST);

		pagamentonaorealizado_ServiceEClass = createEClass(PAGAMENTONAOREALIZADO_SERVICE);

		pagamentonaorealizado_RequestEClass = createEClass(PAGAMENTONAOREALIZADO_REQUEST);

		possuiDinheiroSuficiente_ServiceEClass = createEClass(POSSUI_DINHEIRO_SUFICIENTE_SERVICE);

		possuiDinheiroSuficiente_RequestEClass = createEClass(POSSUI_DINHEIRO_SUFICIENTE_REQUEST);

		entregarRefrigerante_ServiceEClass = createEClass(ENTREGAR_REFRIGERANTE_SERVICE);

		realizarPagamento_ServiceEClass = createEClass(REALIZAR_PAGAMENTO_SERVICE);

		realizarPagamento_RequestEClass = createEClass(REALIZAR_PAGAMENTO_REQUEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		balconistaEClass.getESuperTypes().add(this.getCompradeRefrigerante());
		balconistaEClass.getESuperTypes().add(this.getRefrigeranteIndisponivel_Service());
		balconistaEClass.getESuperTypes().add(this.getRefrigeranteIndisponivel_Request());
		balconistaEClass.getESuperTypes().add(this.getFim_Service());
		balconistaEClass.getESuperTypes().add(this.getFim_Request());
		balconistaEClass.getESuperTypes().add(this.getVerificarDisponibilidade_Request());
		balconistaEClass.getESuperTypes().add(this.getVerificarDinheiroDisponivel_Service());
		balconistaEClass.getESuperTypes().add(this.getRefrigeranteDisponivel_Service());
		balconistaEClass.getESuperTypes().add(this.getRefrigeranteDisponivel_Request());
		balconistaEClass.getESuperTypes().add(this.getEntregarRefrigerante_Request());
		clienteEClass.getESuperTypes().add(this.getCompradeRefrigerante());
		clienteEClass.getESuperTypes().add(this.getVerificarDisponibilidade_Service());
		clienteEClass.getESuperTypes().add(this.getSolicitarRefrigerante_Service());
		clienteEClass.getESuperTypes().add(this.getSolicitarRefrigerante_Request());
		clienteEClass.getESuperTypes().add(this.getVerificarDinheiroDisponivel_Request());
		clienteEClass.getESuperTypes().add(this.getPagamentonaorealizado_Service());
		clienteEClass.getESuperTypes().add(this.getPagamentonaorealizado_Request());
		clienteEClass.getESuperTypes().add(this.getPossuiDinheiroSuficiente_Service());
		clienteEClass.getESuperTypes().add(this.getPossuiDinheiroSuficiente_Request());
		clienteEClass.getESuperTypes().add(this.getEntregarRefrigerante_Service());
		clienteEClass.getESuperTypes().add(this.getRealizarPagamento_Service());
		clienteEClass.getESuperTypes().add(this.getRealizarPagamento_Request());

		// Initialize classes, features, and operations; add parameters
		initEClass(compradeRefrigeranteEClass, CompradeRefrigerante.class, "CompradeRefrigerante", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(balconistaEClass, Balconista.class, "Balconista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBalconista__EntregarRefrigerante(), null, "EntregarRefrigerante", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBalconista__VerificarDisponibilidade(), null, "VerificarDisponibilidade", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(refrigeranteIndisponivel_ServiceEClass, RefrigeranteIndisponivel_Service.class, "RefrigeranteIndisponivel_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refrigeranteIndisponivel_RequestEClass, RefrigeranteIndisponivel_Request.class, "RefrigeranteIndisponivel_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fim_ServiceEClass, Fim_Service.class, "Fim_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fim_RequestEClass, Fim_Request.class, "Fim_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verificarDisponibilidade_RequestEClass, VerificarDisponibilidade_Request.class, "VerificarDisponibilidade_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verificarDinheiroDisponivel_ServiceEClass, VerificarDinheiroDisponivel_Service.class, "VerificarDinheiroDisponivel_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refrigeranteDisponivel_ServiceEClass, RefrigeranteDisponivel_Service.class, "RefrigeranteDisponivel_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refrigeranteDisponivel_RequestEClass, RefrigeranteDisponivel_Request.class, "RefrigeranteDisponivel_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entregarRefrigerante_RequestEClass, EntregarRefrigerante_Request.class, "EntregarRefrigerante_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clienteEClass, Cliente.class, "Cliente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCliente__RealizarPagamento(), null, "RealizarPagamento", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCliente__SolicitarRefrigerante(), null, "SolicitarRefrigerante", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCliente__VerificarDinheiroDisponivel(), null, "VerificarDinheiroDisponivel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(verificarDisponibilidade_ServiceEClass, VerificarDisponibilidade_Service.class, "VerificarDisponibilidade_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitarRefrigerante_ServiceEClass, SolicitarRefrigerante_Service.class, "SolicitarRefrigerante_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitarRefrigerante_RequestEClass, SolicitarRefrigerante_Request.class, "SolicitarRefrigerante_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verificarDinheiroDisponivel_RequestEClass, VerificarDinheiroDisponivel_Request.class, "VerificarDinheiroDisponivel_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagamentonaorealizado_ServiceEClass, Pagamentonaorealizado_Service.class, "Pagamentonaorealizado_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pagamentonaorealizado_RequestEClass, Pagamentonaorealizado_Request.class, "Pagamentonaorealizado_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(possuiDinheiroSuficiente_ServiceEClass, PossuiDinheiroSuficiente_Service.class, "PossuiDinheiroSuficiente_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(possuiDinheiroSuficiente_RequestEClass, PossuiDinheiroSuficiente_Request.class, "PossuiDinheiroSuficiente_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entregarRefrigerante_ServiceEClass, EntregarRefrigerante_Service.class, "EntregarRefrigerante_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realizarPagamento_ServiceEClass, RealizarPagamento_Service.class, "RealizarPagamento_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realizarPagamento_RequestEClass, RealizarPagamento_Request.class, "RealizarPagamento_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Default Collaboration Diagram"
		   });	
		addAnnotation
		  (refrigeranteDisponivel_ServiceEClass, 
		   source, 
		   new String[] {
			 "originalName", "RefrigeranteDisponivel?_Service"
		   });	
		addAnnotation
		  (refrigeranteDisponivel_RequestEClass, 
		   source, 
		   new String[] {
			 "originalName", "RefrigeranteDisponivel?_Request"
		   });	
		addAnnotation
		  (possuiDinheiroSuficiente_ServiceEClass, 
		   source, 
		   new String[] {
			 "originalName", "PossuiDinheiroSuficiente?_Service"
		   });	
		addAnnotation
		  (possuiDinheiroSuficiente_RequestEClass, 
		   source, 
		   new String[] {
			 "originalName", "PossuiDinheiroSuficiente?_Request"
		   });
	}

} //DefaultCollaborationDiagramPackageImpl
