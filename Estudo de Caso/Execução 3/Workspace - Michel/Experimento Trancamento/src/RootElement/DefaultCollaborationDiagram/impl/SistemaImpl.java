/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;
import RootElement.DefaultCollaborationDiagram.Sistema;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SistemaImpl extends DiscenteImpl implements Sistema {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SistemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultCollaborationDiagramPackage.Literals.SISTEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Verificasealunodiscenteeformando() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Aguardarsetediaseefetivartrancamento() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Verificatempodecorrido() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Recuperaalunonosistema() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Verificarquantidadedetrancamentos() {
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
			case DefaultCollaborationDiagramPackage.SISTEMA___VERIFICASEALUNODISCENTEEFORMANDO:
				Verificasealunodiscenteeformando();
				return null;
			case DefaultCollaborationDiagramPackage.SISTEMA___AGUARDARSETEDIASEEFETIVARTRANCAMENTO:
				Aguardarsetediaseefetivartrancamento();
				return null;
			case DefaultCollaborationDiagramPackage.SISTEMA___VERIFICATEMPODECORRIDO:
				Verificatempodecorrido();
				return null;
			case DefaultCollaborationDiagramPackage.SISTEMA___RECUPERAALUNONOSISTEMA:
				Recuperaalunonosistema();
				return null;
			case DefaultCollaborationDiagramPackage.SISTEMA___VERIFICARQUANTIDADEDETRANCAMENTOS:
				Verificarquantidadedetrancamentos();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SistemaImpl
