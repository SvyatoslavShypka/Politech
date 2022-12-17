package Package_Obraz;

import Package_AlgorytmyObrazuBinaryzacja.*;
import Package_AlgorytmyObrazuPreProcessing.*;

public abstract class Obraz {

	/*Zak³adamy rozbudowan¹ klasê w kontekœcie obrazu:
		konstruktor tworz¹cy obraz + inne metody dla obrazu*/
	
	
	/*To s¹ 'uchwyty'na nasze strategie - czyli algorytmy preprocessingu obrazu oraz jego binaryzacji
	Strategie s¹ dostêpne w kodzie g³ownego programu poprzez agregacje referencji na interfejsy strategii !
	Poniewa¿ te referencje istniej¹ tylko po to, aby je udostêpniæ klasom poni¿ej, to mog¹ byæ protected.******/
	protected PrzetworzenieObrazu_PreProcessing PreProc;
	protected WykonanieBinaryzacjiObrazu BinObr;
	//**********************************************************************************************************
	
	//Zmienne pomocnicze________________________
	private String AlgorytmInfoPreProcessing;
	private String AlgorytmInfoBinaryzacja;
	//__________________________________________
	
	
	
	public void wykonajStartegie(int nr_Strategii) {
		
		switch(nr_Strategii) {
		
		case 1 :
			PreProc.SposobNaWykonaniePreProcessing();
			break;		
		case 2 :
			BinObr.SposobNaWykonanieBinaryzacji();
			break;	
		default : System.out.println("Brak wybranej strategii");
		}
		
	}
	
	public void ustawNowaStrategia(int nr_Strategii, PrzetworzenieObrazu_PreProcessing p, String AlgInfo1, WykonanieBinaryzacjiObrazu b, String AlgInfo2) {
		
		switch(nr_Strategii) {
		
		case 1 :
			if (p!=null) {
				
				this.PreProc = p;
				this.AlgorytmInfoPreProcessing = AlgInfo1;
			}		
			break;	 
		case 2 :
			if (b!=null) {
				
			   	this.BinObr = b;	
		    	this.AlgorytmInfoBinaryzacja = AlgInfo2;
			}		
			break;	
		default : System.out.println("Brak wybranej strategii");
		}	
		
	}
	

    //_____________________________________________________________________________________
    
    
    
    /*W klasie zak³¹damy rowniez inne metody - nie sa one u¿ywane
     * (+ set-ery, get-ery) itd. - nie jest to istotne w kontekœcie samego wzorca*/
    //////////////////////////////////////////////////////////////////////////////////////////
    abstract public void WyswietlInfo();
    
	public void ZaladujObraz() {
		System.out.println("£adowanie obrazu");
	}
	
	public void ZapiszObraz() {
		System.out.println("Zapis obrazu do pliku");
	}
	
	//public void getImage(){ return obr; }

	
	public String getAlgorytmInfoPreProcessing() {
		return this.AlgorytmInfoPreProcessing;
	}	
	
	public void setAlgorytmInfoPreProcessing(String s) {
		this.AlgorytmInfoPreProcessing = s;
	}
	
	public String getAlgorytmInfoBinaryzacja() {
		return this.AlgorytmInfoBinaryzacja;
	}
		
	public void setAlgorytmInfoBinaryzacja(String s) {
		this.AlgorytmInfoBinaryzacja = s;
	}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////
}