@XmlRootElement(name = "pet")
public class Pet {
    private long id;
    private Category category;
    private String name;
    private List<String> photoUrls = new ArrayList<String>();
    private List<Tag> tags = new ArrayList<Tag>();
    private String status;

	// Get- og set-metoder for alle attributter. Merk at @XmlElement- 
	// og @XmlRootElement-annotasjonene egentlig ikke er nødvendig
	// her siden de angir samme navn som i koden

	@XmlElement(name = "status")
	@ApiProperty(value = "pet status in the store", 
				 allowableValues = "available,pending,sold")
	public String getStatus() {
		 return status;
	}
}
