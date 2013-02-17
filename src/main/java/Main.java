import com.heroku.api.HerokuAPI;
import com.heroku.api.App;

public class Main {
	public static void main (String[] args) {
		String apiKey = "hogehoge";
		HerokuAPI api = new HerokuAPI(apiKey);
		for(App appName : api.listApps()){
			System.out.println(appName.getName());
		}
	}
}
