/**
 */
package RootElement.DefaultCollaborationDiagram.impl;

import RootElement.DefaultCollaborationDiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultCollaborationDiagramFactoryImpl extends EFactoryImpl implements DefaultCollaborationDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultCollaborationDiagramFactory init() {
		try {
			DefaultCollaborationDiagramFactory theDefaultCollaborationDiagramFactory = (DefaultCollaborationDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(DefaultCollaborationDiagramPackage.eNS_URI);
			if (theDefaultCollaborationDiagramFactory != null) {
				return theDefaultCollaborationDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DefaultCollaborationDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCollaborationDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DefaultCollaborationDiagramPackage.BALCONISTA: return createBalconista();
			case DefaultCollaborationDiagramPackage.CLIENTE: return createCliente();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balconista createBalconista() {
		BalconistaImpl balconista = new BalconistaImpl();
		return balconista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cliente createCliente() {
		ClienteImpl cliente = new ClienteImpl();
		return cliente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultCollaborationDiagramPackage getDefaultCollaborationDiagramPackage() {
		return (DefaultCollaborationDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DefaultCollaborationDiagramPackage getPackage() {
		return DefaultCollaborationDiagramPackage.eINSTANCE;
	}

} //DefaultCollaborationDiagramFactoryImpl
