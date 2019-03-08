package tableJSF.table;

import java.io.Serializable;
import java.util.ArrayList;


import javax.inject.Named;

import tableJSF.table.modelo.DatosPersonales;

@Named(value="tabla")
@javax.enterprise.context.ApplicationScoped
public class BinTabla implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<DatosPersonales>lst=null;
    private DatosPersonales datosSeleccion=new DatosPersonales();

	public ArrayList<DatosPersonales> getLst() {
		if(lst==null)
		{
			lst=new ArrayList<DatosPersonales>();
			for (int i=0; i < 10; i++) {
				DatosPersonales da=new DatosPersonales();
				da.setIddatos(i);
                da.setNombre("Miguel " +i);
                da.setSexo("M");
                da.setTelefono("809-819-4410"+ i);
				lst.add(da);
			}
		}
		return lst;
	}

	public BinTabla() {
		
	}
	
	public void setLst(ArrayList<DatosPersonales> lst) {
		this.lst = lst;
	}

	public DatosPersonales getDatosSeleccion() {
		return datosSeleccion;
	}

	public void setDatosSeleccion(DatosPersonales datosSeleccion) {
		this.datosSeleccion = datosSeleccion;
	}
	
	

}
