package johnbryce;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JsonServlet
 */
@WebServlet("/json")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Create some collection: 
		ArrayList<ClothingItem> clothingItems = new ArrayList<ClothingItem>();
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("White");
		colors.add("Blue");
		colors.add("Black");
		clothingItems.add(new ClothingItem("H&M", "MenX100", "Shirt", 150, "Small", colors));
		clothingItems.add(new ClothingItem("Castro", "MenX200", "Pants", 200, "Medium", colors));
		clothingItems.add(new ClothingItem("Fox", "MenX300", "Jacket", 250, "Large", colors));
		clothingItems.add(new ClothingItem("Golf", "WomenX200", "Underwear", 300, "ExtraLarge", colors));
		clothingItems.add(new ClothingItem("Celio", "WomenX300", "Shoes", 350, "Medium", colors));
		
//		// Create JSON Array: 
//		JSONArray jsonArray = new JSONArray();
/*		
		for (Cat c : cats) {
			
			// Create one JSON Object: 
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("name", c.getName());			
			jsonObject.put("age", c.getAge());
			
			//add the JSON object to the JSONarray
			jsonArray.add(jsonObject);
		}
		*/ 
		String json = clothingItems.toString();
		//System.out.println(json); 
		response.getWriter().append(json); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
