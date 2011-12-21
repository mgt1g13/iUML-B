package ac.soton.eventb.emf.diagrams.generator;

import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.machine.MachinePackage;


/**
 * a simple abstract version of a rule that is always enabled and adds generated elements to 
 * the target Component. Clients may extend this rule to adopt this default behaviour.
 * 
 * @author cfs
 *
 */
public abstract class AbstractRule implements IRule {
	
	protected static EReference variables = MachinePackage.Literals.MACHINE__VARIABLES;
	protected static EReference invariants = MachinePackage.Literals.MACHINE__INVARIANTS;
	protected static EReference events = MachinePackage.Literals.MACHINE__EVENTS;
	protected static EReference guards = MachinePackage.Literals.EVENT__GUARDS;
	protected static EReference actions = MachinePackage.Literals.EVENT__ACTIONS;
	
	@Override
	public boolean enabled(EventBElement sourceElement, final List<GenerationDescriptor> generatedElements) {
		return true;
	}

	@Override
	public EventBNamedCommentedComponentElement getTargetEventBComponent(EventBNamedCommentedComponentElement sourceComponent, EventBElement sourceElement) {
		return sourceComponent;
	}

}
