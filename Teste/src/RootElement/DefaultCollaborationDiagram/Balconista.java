/**
 */
package RootElement.DefaultCollaborationDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balconista</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage#getBalconista()
 * @model
 * @generated
 */
public interface Balconista extends CompradeRefrigerante, RefrigeranteIndisponivel_Service, RefrigeranteIndisponivel_Request, Fim_Service, Fim_Request, VerificarDisponibilidade_Request, VerificarDinheiroDisponivel_Service, RefrigeranteDisponivel_Service, RefrigeranteDisponivel_Request, EntregarRefrigerante_Request {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void EntregarRefrigerante();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void VerificarDisponibilidade();

} // Balconista
