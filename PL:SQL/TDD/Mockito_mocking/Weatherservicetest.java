import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

interface WeatherApi {
    String getWeather();
}

class WeatherService {

    private WeatherApi api;

    WeatherService(WeatherApi api) {
        this.api = api;
    }

    String fetchWeather() {
        return api.getWeather();
    }
}

public class WeatherServiceTest {

    @Test
    void testWeather() {

        WeatherApi api =
                mock(WeatherApi.class);

        when(api.getWeather())
                .thenReturn("Sunny");

        WeatherService s =
                new WeatherService(api);

        assertEquals("Sunny",
                s.fetchWeather());
    }
}