/**
 */
package RootElement.DefaultCollaborationDiagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cliente</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.DefaultCollaborationDiagram.DefaultCollaborationDiagramPackage#getCliente()
 * @model
 * @generated
 */
public interface Cliente extends CompradeRefrigerante, VerificarDisponibilidade_Service, SolicitarRefrigerante_Service, SolicitarRefrigerante_Request, VerificarDinheiroDisponivel_Request, Pagamentonaorealizado_Service, Pagamentonaorealizado_Request, PossuiDinheiroSuficiente_Service, PossuiDinheiroSuficiente_Request, EntregarRefrigerante_Service, RealizarPagamento_Service, RealizarPagamento_Request {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RealizarPagamento();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SolicitarRefrigerante();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void VerificarDinheiroDisponivel();

} // Cliente
