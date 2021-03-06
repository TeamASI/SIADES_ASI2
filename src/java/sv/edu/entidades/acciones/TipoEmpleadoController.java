package sv.edu.entidades.acciones;

import sv.edu.entidades.TipoEmpleado;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "tipoEmpleadoController")
@ViewScoped
public class TipoEmpleadoController extends AbstractController<TipoEmpleado> {

    @Inject
    private EmpleadoController empleadoListController;

    public TipoEmpleadoController() {
        // Inform the Abstract parent controller of the concrete TipoEmpleado?cap_first Entity
        super(TipoEmpleado.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
    }

    /**
     * Sets the "items" attribute with a collection of Empleado entities that
     * are retrieved from TipoEmpleado?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Empleado page
     */
    public String navigateEmpleadoList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Empleado_items", this.getSelected().getEmpleadoList());
        }
        return "/empleado/index";
    }

}
