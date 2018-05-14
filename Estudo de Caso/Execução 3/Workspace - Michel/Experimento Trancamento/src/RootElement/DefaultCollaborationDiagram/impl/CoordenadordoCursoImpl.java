/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.CoordenadordoCurso;
import RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordenadordo Curso</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CoordenadordoCursoImpl extends IESImpl implements CoordenadordoCurso {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordenadordoCursoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultCollaborationDiagramPackage.Literals.COORDENADORDO_CURSO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Analisarsolicitacao() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Cancelarsolicitacao() {
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
			case DefaultCollaborationDiagramPackage.COORDENADORDO_CURSO___ANALISARSOLICITACAO:
				Analisarsolicitacao();
				return null;
			case DefaultCollaborationDiagramPackage.COORDENADORDO_CURSO___CANCELARSOLICITACAO:
				Cancelarsolicitacao();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CoordenadordoCursoImpl
