//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.04 alle 07:39:39 PM CET 
//


package classe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoStudente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoStudente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricola" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoStudente", propOrder = {
    "matricola",
    "cognome",
    "nome"
})
public class TipoStudente {

    @XmlElement(required = true)
    protected String matricola;
    @XmlElement(required = true)
    protected String cognome;
    @XmlElement(required = true)
    protected String nome;

    
    public TipoStudente()
    {
    	
    }
    
    public TipoStudente(String matricola, String cognome, String nome)
    {
    	setMatricola(matricola);
    	setNome(nome);
    	setCognome(cognome);
    }
    
    
    @Override
	public String toString() {
		return "[matricola=" + matricola + ", cognome=" + cognome + ", nome=" + nome + "]";
	}
    
    /**
     * Recupera il valore della proprietà matricola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Imposta il valore della proprietà matricola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricola(String value) {
        this.matricola = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
