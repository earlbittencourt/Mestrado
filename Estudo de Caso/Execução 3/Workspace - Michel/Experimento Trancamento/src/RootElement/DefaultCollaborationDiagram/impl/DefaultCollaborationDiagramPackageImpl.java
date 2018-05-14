/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Request;
import RootElement.DefaultCollaborationDiagram.Aguardarsetediaseefetivartrancamento_Service;
import RootElement.DefaultCollaborationDiagram.Al_Request;
import RootElement.DefaultCollaborationDiagram.Alunodegraduacao_Request;
import RootElement.DefaultCollaborationDiagram.Alunoeativoeformando_Request;
import RootElement.DefaultCollaborationDiagram.Alunonaoeativoounaoeformando_Request;
import RootElement.DefaultCollaborationDiagram.Alunostrictusensu_Request;
import RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Request;
import RootElement.DefaultCollaborationDiagram.Analisarsolicitacao_Service;
import RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Request;
import RootElement.DefaultCollaborationDiagram.Cancelarsolicitacao_Service;
import RootElement.DefaultCollaborationDiagram.CoordenadordoCurso;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramFactory;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;
import RootElement.DefaultCollaborationDiagram.Discente;
import RootElement.DefaultCollaborationDiagram.Oalunoestaemobservacao_Request;
import RootElement.DefaultCollaborationDiagram.Quantidadedetrancamentos_Service;
import RootElement.DefaultCollaborationDiagram.Sistema;
import RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Request;
import RootElement.DefaultCollaborationDiagram.Solicitacaoaprovada_Service;
import RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Request;
import RootElement.DefaultCollaborationDiagram.Solicitacaocancelada_Service;
import RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Request;
import RootElement.DefaultCollaborationDiagram.Solicitartrancamento_Service;
import RootElement.DefaultCollaborationDiagram.Tempodecorrido_Service;
import RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinaemenorque50_Request;
import RootElement.DefaultCollaborationDiagram.Tempodecorridodadisciplinapassou50_Request;
import RootElement.DefaultCollaborationDiagram.solitacaodeferida_Request;
import RootElement.DefaultCollaborationDiagram.solitacaodeferida_Service;
import RootElement.DefaultCollaborationDiagram.verificaaluno_Service;

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
	private EClass iesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discenteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempodecorridodadisciplinapassou50_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass al_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitartrancamento_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitartrancamento_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunonaoeativoounaoeformando_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificaaluno_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oalunoestaemobservacao_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitacaoaprovada_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitacaoaprovada_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempodecorrido_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunostrictusensu_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analisarsolicitacao_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoeativoeformando_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantidadedetrancamentos_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunodegraduacao_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aguardarsetediaseefetivartrancamento_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aguardarsetediaseefetivartrancamento_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tempodecorridodadisciplinaemenorque50_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordenadordoCursoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solitacaodeferida_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solitacaodeferida_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelarsolicitacao_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelarsolicitacao_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analisarsolicitacao_RequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitacaocancelada_ServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solicitacaocancelada_RequestEClass = null;

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
	public EClass getIES() {
		return iesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscente() {
		return discenteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiscente__Solicitartrancamento() {
		return discenteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTempodecorridodadisciplinapassou50_Request() {
		return tempodecorridodadisciplinapassou50_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAl_Request() {
		return al_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitartrancamento_Service() {
		return solicitartrancamento_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitartrancamento_Request() {
		return solicitartrancamento_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlunonaoeativoounaoeformando_Request() {
		return alunonaoeativoounaoeformando_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSistema() {
		return sistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistema__Verificasealunodiscenteeformando() {
		return sistemaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistema__Aguardarsetediaseefetivartrancamento() {
		return sistemaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistema__Verificatempodecorrido() {
		return sistemaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistema__Recuperaalunonosistema() {
		return sistemaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSistema__Verificarquantidadedetrancamentos() {
		return sistemaEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getverificaaluno_Service() {
		return verificaaluno_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOalunoestaemobservacao_Request() {
		return oalunoestaemobservacao_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitacaoaprovada_Service() {
		return solicitacaoaprovada_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitacaoaprovada_Request() {
		return solicitacaoaprovada_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTempodecorrido_Service() {
		return tempodecorrido_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlunostrictusensu_Request() {
		return alunostrictusensu_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalisarsolicitacao_Service() {
		return analisarsolicitacao_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlunoeativoeformando_Request() {
		return alunoeativoeformando_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantidadedetrancamentos_Service() {
		return quantidadedetrancamentos_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlunodegraduacao_Request() {
		return alunodegraduacao_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAguardarsetediaseefetivartrancamento_Service() {
		return aguardarsetediaseefetivartrancamento_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAguardarsetediaseefetivartrancamento_Request() {
		return aguardarsetediaseefetivartrancamento_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTempodecorridodadisciplinaemenorque50_Request() {
		return tempodecorridodadisciplinaemenorque50_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordenadordoCurso() {
		return coordenadordoCursoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoordenadordoCurso__Analisarsolicitacao() {
		return coordenadordoCursoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoordenadordoCurso__Cancelarsolicitacao() {
		return coordenadordoCursoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsolitacaodeferida_Service() {
		return solitacaodeferida_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsolitacaodeferida_Request() {
		return solitacaodeferida_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelarsolicitacao_Service() {
		return cancelarsolicitacao_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelarsolicitacao_Request() {
		return cancelarsolicitacao_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalisarsolicitacao_Request() {
		return analisarsolicitacao_RequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitacaocancelada_Service() {
		return solicitacaocancelada_ServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolicitacaocancelada_Request() {
		return solicitacaocancelada_RequestEClass;
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
		iesEClass = createEClass(IES);

		discenteEClass = createEClass(DISCENTE);
		createEOperation(discenteEClass, DISCENTE___SOLICITARTRANCAMENTO);

		tempodecorridodadisciplinapassou50_RequestEClass = createEClass(TEMPODECORRIDODADISCIPLINAPASSOU50_REQUEST);

		al_RequestEClass = createEClass(AL_REQUEST);

		solicitartrancamento_ServiceEClass = createEClass(SOLICITARTRANCAMENTO_SERVICE);

		solicitartrancamento_RequestEClass = createEClass(SOLICITARTRANCAMENTO_REQUEST);

		alunonaoeativoounaoeformando_RequestEClass = createEClass(ALUNONAOEATIVOOUNAOEFORMANDO_REQUEST);

		sistemaEClass = createEClass(SISTEMA);
		createEOperation(sistemaEClass, SISTEMA___VERIFICASEALUNODISCENTEEFORMANDO);
		createEOperation(sistemaEClass, SISTEMA___AGUARDARSETEDIASEEFETIVARTRANCAMENTO);
		createEOperation(sistemaEClass, SISTEMA___VERIFICATEMPODECORRIDO);
		createEOperation(sistemaEClass, SISTEMA___RECUPERAALUNONOSISTEMA);
		createEOperation(sistemaEClass, SISTEMA___VERIFICARQUANTIDADEDETRANCAMENTOS);

		verificaaluno_ServiceEClass = createEClass(VERIFICAALUNO_SERVICE);

		oalunoestaemobservacao_RequestEClass = createEClass(OALUNOESTAEMOBSERVACAO_REQUEST);

		solicitacaoaprovada_ServiceEClass = createEClass(SOLICITACAOAPROVADA_SERVICE);

		solicitacaoaprovada_RequestEClass = createEClass(SOLICITACAOAPROVADA_REQUEST);

		tempodecorrido_ServiceEClass = createEClass(TEMPODECORRIDO_SERVICE);

		alunostrictusensu_RequestEClass = createEClass(ALUNOSTRICTUSENSU_REQUEST);

		analisarsolicitacao_ServiceEClass = createEClass(ANALISARSOLICITACAO_SERVICE);

		alunoeativoeformando_RequestEClass = createEClass(ALUNOEATIVOEFORMANDO_REQUEST);

		quantidadedetrancamentos_ServiceEClass = createEClass(QUANTIDADEDETRANCAMENTOS_SERVICE);

		alunodegraduacao_RequestEClass = createEClass(ALUNODEGRADUACAO_REQUEST);

		aguardarsetediaseefetivartrancamento_ServiceEClass = createEClass(AGUARDARSETEDIASEEFETIVARTRANCAMENTO_SERVICE);

		aguardarsetediaseefetivartrancamento_RequestEClass = createEClass(AGUARDARSETEDIASEEFETIVARTRANCAMENTO_REQUEST);

		tempodecorridodadisciplinaemenorque50_RequestEClass = createEClass(TEMPODECORRIDODADISCIPLINAEMENORQUE50_REQUEST);

		coordenadordoCursoEClass = createEClass(COORDENADORDO_CURSO);
		createEOperation(coordenadordoCursoEClass, COORDENADORDO_CURSO___ANALISARSOLICITACAO);
		createEOperation(coordenadordoCursoEClass, COORDENADORDO_CURSO___CANCELARSOLICITACAO);

		solitacaodeferida_ServiceEClass = createEClass(SOLITACAODEFERIDA_SERVICE);

		solitacaodeferida_RequestEClass = createEClass(SOLITACAODEFERIDA_REQUEST);

		cancelarsolicitacao_ServiceEClass = createEClass(CANCELARSOLICITACAO_SERVICE);

		cancelarsolicitacao_RequestEClass = createEClass(CANCELARSOLICITACAO_REQUEST);

		analisarsolicitacao_RequestEClass = createEClass(ANALISARSOLICITACAO_REQUEST);

		solicitacaocancelada_ServiceEClass = createEClass(SOLICITACAOCANCELADA_SERVICE);

		solicitacaocancelada_RequestEClass = createEClass(SOLICITACAOCANCELADA_REQUEST);
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
		discenteEClass.getESuperTypes().add(this.getIES());
		discenteEClass.getESuperTypes().add(this.getTempodecorridodadisciplinapassou50_Request());
		discenteEClass.getESuperTypes().add(this.getAl_Request());
		discenteEClass.getESuperTypes().add(this.getSolicitartrancamento_Service());
		discenteEClass.getESuperTypes().add(this.getSolicitartrancamento_Request());
		discenteEClass.getESuperTypes().add(this.getAlunonaoeativoounaoeformando_Request());
		sistemaEClass.getESuperTypes().add(this.getDiscente());
		sistemaEClass.getESuperTypes().add(this.getverificaaluno_Service());
		sistemaEClass.getESuperTypes().add(this.getOalunoestaemobservacao_Request());
		sistemaEClass.getESuperTypes().add(this.getSolicitacaoaprovada_Service());
		sistemaEClass.getESuperTypes().add(this.getSolicitacaoaprovada_Request());
		sistemaEClass.getESuperTypes().add(this.getTempodecorrido_Service());
		sistemaEClass.getESuperTypes().add(this.getAlunostrictusensu_Request());
		sistemaEClass.getESuperTypes().add(this.getAnalisarsolicitacao_Service());
		sistemaEClass.getESuperTypes().add(this.getAlunoeativoeformando_Request());
		sistemaEClass.getESuperTypes().add(this.getQuantidadedetrancamentos_Service());
		sistemaEClass.getESuperTypes().add(this.getAlunodegraduacao_Request());
		sistemaEClass.getESuperTypes().add(this.getAguardarsetediaseefetivartrancamento_Service());
		sistemaEClass.getESuperTypes().add(this.getAguardarsetediaseefetivartrancamento_Request());
		sistemaEClass.getESuperTypes().add(this.getTempodecorridodadisciplinaemenorque50_Request());
		coordenadordoCursoEClass.getESuperTypes().add(this.getIES());
		coordenadordoCursoEClass.getESuperTypes().add(this.getsolitacaodeferida_Service());
		coordenadordoCursoEClass.getESuperTypes().add(this.getsolitacaodeferida_Request());
		coordenadordoCursoEClass.getESuperTypes().add(this.getCancelarsolicitacao_Service());
		coordenadordoCursoEClass.getESuperTypes().add(this.getCancelarsolicitacao_Request());
		coordenadordoCursoEClass.getESuperTypes().add(this.getAnalisarsolicitacao_Request());
		coordenadordoCursoEClass.getESuperTypes().add(this.getSolicitacaocancelada_Service());
		coordenadordoCursoEClass.getESuperTypes().add(this.getSolicitacaocancelada_Request());

		// Initialize classes, features, and operations; add parameters
		initEClass(iesEClass, RootElement.DefaultCollaborationDiagram.IES.class, "IES", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discenteEClass, Discente.class, "Discente", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDiscente__Solicitartrancamento(), null, "Solicitartrancamento", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(tempodecorridodadisciplinapassou50_RequestEClass, Tempodecorridodadisciplinapassou50_Request.class, "Tempodecorridodadisciplinapassou50_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(al_RequestEClass, Al_Request.class, "Al_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitartrancamento_ServiceEClass, Solicitartrancamento_Service.class, "Solicitartrancamento_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitartrancamento_RequestEClass, Solicitartrancamento_Request.class, "Solicitartrancamento_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunonaoeativoounaoeformando_RequestEClass, Alunonaoeativoounaoeformando_Request.class, "Alunonaoeativoounaoeformando_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sistemaEClass, Sistema.class, "Sistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSistema__Verificasealunodiscenteeformando(), null, "Verificasealunodiscenteeformando", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistema__Aguardarsetediaseefetivartrancamento(), null, "Aguardarsetediaseefetivartrancamento", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistema__Verificatempodecorrido(), null, "Verificatempodecorrido", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistema__Recuperaalunonosistema(), null, "Recuperaalunonosistema", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSistema__Verificarquantidadedetrancamentos(), null, "Verificarquantidadedetrancamentos", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(verificaaluno_ServiceEClass, verificaaluno_Service.class, "verificaaluno_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oalunoestaemobservacao_RequestEClass, Oalunoestaemobservacao_Request.class, "Oalunoestaemobservacao_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitacaoaprovada_ServiceEClass, Solicitacaoaprovada_Service.class, "Solicitacaoaprovada_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitacaoaprovada_RequestEClass, Solicitacaoaprovada_Request.class, "Solicitacaoaprovada_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tempodecorrido_ServiceEClass, Tempodecorrido_Service.class, "Tempodecorrido_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunostrictusensu_RequestEClass, Alunostrictusensu_Request.class, "Alunostrictusensu_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analisarsolicitacao_ServiceEClass, Analisarsolicitacao_Service.class, "Analisarsolicitacao_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunoeativoeformando_RequestEClass, Alunoeativoeformando_Request.class, "Alunoeativoeformando_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantidadedetrancamentos_ServiceEClass, Quantidadedetrancamentos_Service.class, "Quantidadedetrancamentos_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunodegraduacao_RequestEClass, Alunodegraduacao_Request.class, "Alunodegraduacao_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aguardarsetediaseefetivartrancamento_ServiceEClass, Aguardarsetediaseefetivartrancamento_Service.class, "Aguardarsetediaseefetivartrancamento_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aguardarsetediaseefetivartrancamento_RequestEClass, Aguardarsetediaseefetivartrancamento_Request.class, "Aguardarsetediaseefetivartrancamento_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tempodecorridodadisciplinaemenorque50_RequestEClass, Tempodecorridodadisciplinaemenorque50_Request.class, "Tempodecorridodadisciplinaemenorque50_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordenadordoCursoEClass, CoordenadordoCurso.class, "CoordenadordoCurso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCoordenadordoCurso__Analisarsolicitacao(), null, "Analisarsolicitacao", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCoordenadordoCurso__Cancelarsolicitacao(), null, "Cancelarsolicitacao", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(solitacaodeferida_ServiceEClass, solitacaodeferida_Service.class, "solitacaodeferida_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solitacaodeferida_RequestEClass, solitacaodeferida_Request.class, "solitacaodeferida_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cancelarsolicitacao_ServiceEClass, Cancelarsolicitacao_Service.class, "Cancelarsolicitacao_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cancelarsolicitacao_RequestEClass, Cancelarsolicitacao_Request.class, "Cancelarsolicitacao_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analisarsolicitacao_RequestEClass, Analisarsolicitacao_Request.class, "Analisarsolicitacao_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitacaocancelada_ServiceEClass, Solicitacaocancelada_Service.class, "Solicitacaocancelada_Service", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solicitacaocancelada_RequestEClass, Solicitacaocancelada_Request.class, "Solicitacaocancelada_Request", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (tempodecorridodadisciplinapassou50_RequestEClass, 
		   source, 
		   new String[] {
			 "originalName", "Tempodecorridodadisciplinapassou50%_Request"
		   });	
		addAnnotation
		  (oalunoestaemobservacao_RequestEClass, 
		   source, 
		   new String[] {
			 "originalName", "Oalunoestaemobservacao?_Request"
		   });	
		addAnnotation
		  (tempodecorridodadisciplinaemenorque50_RequestEClass, 
		   source, 
		   new String[] {
			 "originalName", "Tempodecorridodadisciplinaemenorque50%_Request"
		   });	
		addAnnotation
		  (solitacaodeferida_ServiceEClass, 
		   source, 
		   new String[] {
			 "originalName", "solitacaodeferida?_Service"
		   });	
		addAnnotation
		  (solitacaodeferida_RequestEClass, 
		   source, 
		   new String[] {
			 "originalName", "solitacaodeferida?_Request"
		   });
	}

} //DefaultCollaborationDiagramPackageImpl
