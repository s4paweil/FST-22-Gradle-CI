import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class DataTest {

    @Test
    public void tmpTest() {
        Assert.assertEquals(true, true);
    }

    // Testet ob der DataLoader die Daten die Datei korrekt ausliest oder ein leeres Ergebnis zurück gibt
    @Test
    public void testDataLoader(){
        DataLoader dataLoader = new DataLoader();
        String json = dataLoader.loadJsonFile("countries-aggregated_json.json");
        Assert.assertEquals(false, json.isEmpty());
    }


}
