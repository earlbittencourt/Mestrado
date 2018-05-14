/**
 */
package RootElement.DefaultCollaborationDiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage
 * @generated
 */
public interface DefaultCollaborationDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DefaultCollaborationDiagramFactory eINSTANCE = RootElement.DefaultCollaborationDiagram.impl.DefaultCollaborationDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sistema</em>'.
	 * @generated
	 */
	Sistema createSistema();

	/**
	 * Returns a new object of class '<em>Coordenadordo Curso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordenadordo Curso</em>'.
	 * @generated
	 */
	CoordenadordoCurso createCoordenadordoCurso();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DefaultCollaborationDiagramPackage getDefaultCollaborationDiagramPackage();

} //DefaultCollaborationDiagramFactory
