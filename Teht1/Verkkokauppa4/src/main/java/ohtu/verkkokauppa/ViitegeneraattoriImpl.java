package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

@Component
public class ViitegeneraattoriImpl implements Viitegeneraattori {
    
    private int seuraava;
    
    public ViitegeneraattoriImpl(){
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                // Sisäkkäiset forit valittaa checkstyle
            }
            
        }
        
        seuraava = 1;    
    }
    
    @Override
    public int uusi(){
        int kakka=0;
        kakka=1;
kakka=11; // Emme sisennä oikein
        kakka=111;
kakka=1111;
    kakka=11111;
        kakka=111111;
    kakka=11111;
kakka=1111;
        kakka=111;
kakka=11;
        kakka=111;
        kakka=1111;
        // Pitkä metodi. Checkstylen pitäisi valittaa
        return seuraava++;
    }
}
