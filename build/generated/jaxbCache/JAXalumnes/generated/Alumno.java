//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.11.02 a las 06:22:27 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="asignaturas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tutorias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "codi",
    "asignaturas",
    "tutorias"
})
@XmlRootElement(name = "alumno")
public class Alumno {

    @XmlElement(required = true)
    protected String nombre;
    protected int codi;
    @XmlElement(required = true)
    protected String asignaturas;
    @XmlElement(required = true)
    protected String tutorias;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad codi.
     * 
     */
    public int getCodi() {
        return codi;
    }

    /**
     * Define el valor de la propiedad codi.
     * 
     */
    public void setCodi(int value) {
        this.codi = value;
    }

    /**
     * Obtiene el valor de la propiedad asignaturas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsignaturas() {
        return asignaturas;
    }

    /**
     * Define el valor de la propiedad asignaturas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsignaturas(String value) {
        this.asignaturas = value;
    }

    /**
     * Obtiene el valor de la propiedad tutorias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTutorias() {
        return tutorias;
    }

    /**
     * Define el valor de la propiedad tutorias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTutorias(String value) {
        this.tutorias = value;
    }

}
