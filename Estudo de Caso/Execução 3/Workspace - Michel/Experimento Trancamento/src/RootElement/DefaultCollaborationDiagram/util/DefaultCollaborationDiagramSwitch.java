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
			case DefaultCollaborationDiagramPackage.IES: {
				IES ies = (IES)theEObject;
				T result = caseIES(ies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.DISCENTE: {
				Discente discente = (Discente)theEObject;
				T result = caseDiscente(discente);
				if (result == null) result = caseIES(discente);
				if (result == null) result = caseTempodecorridodadisciplinapassou50_Request(discente);
				if (result == null) result = caseAl_Request(discente);
				if (result == null) result = caseSolicitartrancamento_Service(discente);
				if (result == null) result = caseSolicitartrancamento_Request(discente);
				if (result == null) result = caseAlunonaoeativoounaoeformando_Request(discente);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.TEMPODECORRIDODADISCIPLINAPASSOU50_REQUEST: {
				Tempodecorridodadisciplinapassou50_Request tempodecorridodadisciplinapassou50_Request = (Tempodecorridodadisciplinapassou50_Request)theEObject;
				T result = caseTempodecorridodadisciplinapassou50_Request(tempodecorridodadisciplinapassou50_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.AL_REQUEST: {
				Al_Request al_Request = (Al_Request)theEObject;
				T result = caseAl_Request(al_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITARTRANCAMENTO_SERVICE: {
				Solicitartrancamento_Service solicitartrancamento_Service = (Solicitartrancamento_Service)theEObject;
				T result = caseSolicitartrancamento_Service(solicitartrancamento_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITARTRANCAMENTO_REQUEST: {
				Solicitartrancamento_Request solicitartrancamento_Request = (Solicitartrancamento_Request)theEObject;
				T result = caseSolicitartrancamento_Request(solicitartrancamento_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ALUNONAOEATIVOOUNAOEFORMANDO_REQUEST: {
				Alunonaoeativoounaoeformando_Request alunonaoeativoounaoeformando_Request = (Alunonaoeativoounaoeformando_Request)theEObject;
				T result = caseAlunonaoeativoounaoeformando_Request(alunonaoeativoounaoeformando_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SISTEMA: {
				Sistema sistema = (Sistema)theEObject;
				T result = caseSistema(sistema);
				if (result == null) result = caseDiscente(sistema);
				if (result == null) result = caseverificaaluno_Service(sistema);
				if (result == null) result = caseOalunoestaemobservacao_Request(sistema);
				if (result == null) result = caseSolicitacaoaprovada_Service(sistema);
				if (result == null) result = caseSolicitacaoaprovada_Request(sistema);
				if (result == null) result = caseTempodecorrido_Service(sistema);
				if (result == null) result = caseAlunostrictusensu_Request(sistema);
				if (result == null) result = caseAnalisarsolicitacao_Service(sistema);
				if (result == null) result = caseAlunoeativoeformando_Request(sistema);
				if (result == null) result = caseQuantidadedetrancamentos_Service(sistema);
				if (result == null) result = caseAlunodegraduacao_Request(sistema);
				if (result == null) result = caseAguardarsetediaseefetivartrancamento_Service(sistema);
				if (result == null) result = caseAguardarsetediaseefetivartrancamento_Request(sistema);
				if (result == null) result = caseTempodecorridodadisciplinaemenorque50_Request(sistema);
				if (result == null) result = caseIES(sistema);
				if (result == null) result = caseTempodecorridodadisciplinapassou50_Request(sistema);
				if (result == null) result = caseAl_Request(sistema);
				if (result == null) result = caseSolicitartrancamento_Service(sistema);
				if (result == null) result = caseSolicitartrancamento_Request(sistema);
				if (result == null) result = caseAlunonaoeativoounaoeformando_Request(sistema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.VERIFICAALUNO_SERVICE: {
				verificaaluno_Service verificaaluno_Service = (verificaaluno_Service)theEObject;
				T result = caseverificaaluno_Service(verificaaluno_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.OALUNOESTAEMOBSERVACAO_REQUEST: {
				Oalunoestaemobservacao_Request oalunoestaemobservacao_Request = (Oalunoestaemobservacao_Request)theEObject;
				T result = caseOalunoestaemobservacao_Request(oalunoestaemobservacao_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITACAOAPROVADA_SERVICE: {
				Solicitacaoaprovada_Service solicitacaoaprovada_Service = (Solicitacaoaprovada_Service)theEObject;
				T result = caseSolicitacaoaprovada_Service(solicitacaoaprovada_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITACAOAPROVADA_REQUEST: {
				Solicitacaoaprovada_Request solicitacaoaprovada_Request = (Solicitacaoaprovada_Request)theEObject;
				T result = caseSolicitacaoaprovada_Request(solicitacaoaprovada_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.TEMPODECORRIDO_SERVICE: {
				Tempodecorrido_Service tempodecorrido_Service = (Tempodecorrido_Service)theEObject;
				T result = caseTempodecorrido_Service(tempodecorrido_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ALUNOSTRICTUSENSU_REQUEST: {
				Alunostrictusensu_Request alunostrictusensu_Request = (Alunostrictusensu_Request)theEObject;
				T result = caseAlunostrictusensu_Request(alunostrictusensu_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ANALISARSOLICITACAO_SERVICE: {
				Analisarsolicitacao_Service analisarsolicitacao_Service = (Analisarsolicitacao_Service)theEObject;
				T result = caseAnalisarsolicitacao_Service(analisarsolicitacao_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ALUNOEATIVOEFORMANDO_REQUEST: {
				Alunoeativoeformando_Request alunoeativoeformando_Request = (Alunoeativoeformando_Request)theEObject;
				T result = caseAlunoeativoeformando_Request(alunoeativoeformando_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.QUANTIDADEDETRANCAMENTOS_SERVICE: {
				Quantidadedetrancamentos_Service quantidadedetrancamentos_Service = (Quantidadedetrancamentos_Service)theEObject;
				T result = caseQuantidadedetrancamentos_Service(quantidadedetrancamentos_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ALUNODEGRADUACAO_REQUEST: {
				Alunodegraduacao_Request alunodegraduacao_Request = (Alunodegraduacao_Request)theEObject;
				T result = caseAlunodegraduacao_Request(alunodegraduacao_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.AGUARDARSETEDIASEEFETIVARTRANCAMENTO_SERVICE: {
				Aguardarsetediaseefetivartrancamento_Service aguardarsetediaseefetivartrancamento_Service = (Aguardarsetediaseefetivartrancamento_Service)theEObject;
				T result = caseAguardarsetediaseefetivartrancamento_Service(aguardarsetediaseefetivartrancamento_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.AGUARDARSETEDIASEEFETIVARTRANCAMENTO_REQUEST: {
				Aguardarsetediaseefetivartrancamento_Request aguardarsetediaseefetivartrancamento_Request = (Aguardarsetediaseefetivartrancamento_Request)theEObject;
				T result = caseAguardarsetediaseefetivartrancamento_Request(aguardarsetediaseefetivartrancamento_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.TEMPODECORRIDODADISCIPLINAEMENORQUE50_REQUEST: {
				Tempodecorridodadisciplinaemenorque50_Request tempodecorridodadisciplinaemenorque50_Request = (Tempodecorridodadisciplinaemenorque50_Request)theEObject;
				T result = caseTempodecorridodadisciplinaemenorque50_Request(tempodecorridodadisciplinaemenorque50_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.COORDENADORDO_CURSO: {
				CoordenadordoCurso coordenadordoCurso = (CoordenadordoCurso)theEObject;
				T result = caseCoordenadordoCurso(coordenadordoCurso);
				if (result == null) result = caseIES(coordenadordoCurso);
				if (result == null) result = casesolitacaodeferida_Service(coordenadordoCurso);
				if (result == null) result = casesolitacaodeferida_Request(coordenadordoCurso);
				if (result == null) result = caseCancelarsolicitacao_Service(coordenadordoCurso);
				if (result == null) result = caseCancelarsolicitacao_Request(coordenadordoCurso);
				if (result == null) result = caseAnalisarsolicitacao_Request(coordenadordoCurso);
				if (result == null) result = caseSolicitacaocancelada_Service(coordenadordoCurso);
				if (result == null) result = caseSolicitacaocancelada_Request(coordenadordoCurso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLITACAODEFERIDA_SERVICE: {
				solitacaodeferida_Service solitacaodeferida_Service = (solitacaodeferida_Service)theEObject;
				T result = casesolitacaodeferida_Service(solitacaodeferida_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLITACAODEFERIDA_REQUEST: {
				solitacaodeferida_Request solitacaodeferida_Request = (solitacaodeferida_Request)theEObject;
				T result = casesolitacaodeferida_Request(solitacaodeferida_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.CANCELARSOLICITACAO_SERVICE: {
				Cancelarsolicitacao_Service cancelarsolicitacao_Service = (Cancelarsolicitacao_Service)theEObject;
				T result = caseCancelarsolicitacao_Service(cancelarsolicitacao_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.CANCELARSOLICITACAO_REQUEST: {
				Cancelarsolicitacao_Request cancelarsolicitacao_Request = (Cancelarsolicitacao_Request)theEObject;
				T result = caseCancelarsolicitacao_Request(cancelarsolicitacao_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.ANALISARSOLICITACAO_REQUEST: {
				Analisarsolicitacao_Request analisarsolicitacao_Request = (Analisarsolicitacao_Request)theEObject;
				T result = caseAnalisarsolicitacao_Request(analisarsolicitacao_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITACAOCANCELADA_SERVICE: {
				Solicitacaocancelada_Service solicitacaocancelada_Service = (Solicitacaocancelada_Service)theEObject;
				T result = caseSolicitacaocancelada_Service(solicitacaocancelada_Service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultCollaborationDiagramPackage.SOLICITACAOCANCELADA_REQUEST: {
				Solicitacaocancelada_Request solicitacaocancelada_Request = (Solicitacaocancelada_Request)theEObject;
				T result = caseSolicitacaocancelada_Request(solicitacaocancelada_Request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIES(IES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discente</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discente</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscente(Discente object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tempodecorridodadisciplinapassou50 Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tempodecorridodadisciplinapassou50 Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempodecorridodadisciplinapassou50_Request(Tempodecorridodadisciplinapassou50_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Al Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Al Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAl_Request(Al_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitartrancamento Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitartrancamento Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitartrancamento_Service(Solicitartrancamento_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitartrancamento Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitartrancamento Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitartrancamento_Request(Solicitartrancamento_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alunonaoeativoounaoeformando Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alunonaoeativoounaoeformando Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlunonaoeativoounaoeformando_Request(Alunonaoeativoounaoeformando_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sistema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSistema(Sistema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>verificaaluno Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>verificaaluno Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseverificaaluno_Service(verificaaluno_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oalunoestaemobservacao Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oalunoestaemobservacao Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOalunoestaemobservacao_Request(Oalunoestaemobservacao_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitacaoaprovada Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitacaoaprovada Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitacaoaprovada_Service(Solicitacaoaprovada_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitacaoaprovada Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitacaoaprovada Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitacaoaprovada_Request(Solicitacaoaprovada_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tempodecorrido Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tempodecorrido Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempodecorrido_Service(Tempodecorrido_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alunostrictusensu Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alunostrictusensu Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlunostrictusensu_Request(Alunostrictusensu_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analisarsolicitacao Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analisarsolicitacao Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalisarsolicitacao_Service(Analisarsolicitacao_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alunoeativoeformando Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alunoeativoeformando Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlunoeativoeformando_Request(Alunoeativoeformando_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantidadedetrancamentos Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantidadedetrancamentos Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantidadedetrancamentos_Service(Quantidadedetrancamentos_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alunodegraduacao Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alunodegraduacao Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlunodegraduacao_Request(Alunodegraduacao_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aguardarsetediaseefetivartrancamento Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aguardarsetediaseefetivartrancamento Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAguardarsetediaseefetivartrancamento_Service(Aguardarsetediaseefetivartrancamento_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aguardarsetediaseefetivartrancamento Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aguardarsetediaseefetivartrancamento Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAguardarsetediaseefetivartrancamento_Request(Aguardarsetediaseefetivartrancamento_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tempodecorridodadisciplinaemenorque50 Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tempodecorridodadisciplinaemenorque50 Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempodecorridodadisciplinaemenorque50_Request(Tempodecorridodadisciplinaemenorque50_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordenadordo Curso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordenadordo Curso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordenadordoCurso(CoordenadordoCurso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>solitacaodeferida Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>solitacaodeferida Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesolitacaodeferida_Service(solitacaodeferida_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>solitacaodeferida Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>solitacaodeferida Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesolitacaodeferida_Request(solitacaodeferida_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancelarsolicitacao Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancelarsolicitacao Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelarsolicitacao_Service(Cancelarsolicitacao_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancelarsolicitacao Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancelarsolicitacao Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancelarsolicitacao_Request(Cancelarsolicitacao_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analisarsolicitacao Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analisarsolicitacao Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalisarsolicitacao_Request(Analisarsolicitacao_Request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitacaocancelada Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitacaocancelada Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitacaocancelada_Service(Solicitacaocancelada_Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solicitacaocancelada Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solicitacaocancelada Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolicitacaocancelada_Request(Solicitacaocancelada_Request object) {
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
