
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class O_Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	
	@Column(name = "Product")
	private String Product;
	
	@Column(name = "materialtype")
	private String MaterialType;
	
	@Column(name = "size")
	private String Size;
	
	@Column(name = "color")
	private String Color;
	
	@Column(name = "features")
	private String Features;
	
	@Column(name = "type")
	private String Type;
	
	@Column(name = "quantity")
	private String Quantity;
	
	public O_Product() {
		
	}

	public O_Product(String product, String materialType, String size, String color, String features, String type,
			String quantity) {
		super();
		Product = product;
		MaterialType = materialType;
		Size = size;
		Color = color;
		Features = features;
		Type = type;
		Quantity = quantity;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getMaterialType() {
		return MaterialType;
	}

	public void setMaterialType(String materialType) {
		MaterialType = materialType;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getFeatures() {
		return Features;
	}

	public void setFeatures(String features) {
		Features = features;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

}
