package com.sb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*@RequestMapping("/proapi")*/
public class ProductController {
@Value ("${message}")
String message1;

@Value ("${message}")
String message2;

@Value ("${message}")
String message3;

@GetMapping("/welcome")
public String getMessage()
{
    return "Hi "+message1;
}
}
	/*// private static final String name = null;
	@Autowired
	ProductService ps;

	@Autowired
	ProductRepository pr;

	
	 * @PostMapping("/create") public ResponseEntity<Product1>
	 * createproduct(@Valid @RequestBody Product1 product) { try { Product1 p1 =
	 * ps.saveOrUpdate(product); return new ResponseEntity<>(p1,
	 * HttpStatus.CREATED); } catch (Exception e) { return new
	 * ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); } }
	 

	@PostMapping("/create")
	private int saveProduct(@RequestBody Product1 product) {
		ps.saveOrupdate(product);
		return product.getId();
	}

	
	 * @GetMapping("/readAll") public ResponseEntity<List<Product1>>
	 * getAllProducts(@RequestParam (required=false)String name) { try {
	 * List<Product1> products = new ArrayList<Product1>();
	 * 
	 * if (name == null) pr.findAll().forEach(products::add); else
	 * pr.findByNameContaining(name).forEach(products::add);
	 * 
	 * if (products.isEmpty()) { return new
	 * ResponseEntity<>(HttpStatus.NO_CONTENT); }
	 * 
	 * return new ResponseEntity<>(products, HttpStatus.OK); } catch (Exception
	 * e) { return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	 * } }
	 
	@GetMapping("/products/{id}")
	public ResponseEntity<Product1> getProductById(@PathVariable(value = "id") int productsId)
			throws ResourceNotFoundException {
		Product1 products = pr.findById(productsId)
				.orElseThrow(() -> new ResourceNotFoundException(
						"Your Entered Employee Number is not available in Database,Could you please try with other Emp Number :: "
								+ productsId));
		return ResponseEntity.ok().body(products);
	}

	@GetMapping("/get")
	private List<Product1> getAllProduct() {
		return ps.getAllProduct();
	}

	@DeleteMapping("/delete/{id}")
	private void deleteProduct(@PathVariable("id") int id) {
		ps.delete(id);
	}

	@GetMapping("/get/{id}")

	private Product1 getproduct(@PathVariable("id") int id) {
		return ps.getProductById(id);
	}

	@PutMapping("/update/{id}")
	private Product1 update(@RequestBody Product1 product) {
		ps.saveOrUpdate(product);
		return product;
	}
}
*/