package prolab;
public class LeBronJames extends Sporcu {

	int sporcuPuani = 0;
        int ikilik=0;
        int ucluk=0;
        int serbestAtis=0;
	boolean kartKullanildiMi = false;

	public int getsporcuPuani() {
		return sporcuPuani;
	}
        

	public void setsporcuPuani(int sporcuPuani) {
		this.sporcuPuani = sporcuPuani;
	}

	public LeBronJames() {
		super();
                this.sporcuIsim = "LeBron James ";
                this.sporcuTakim = "Lakers ";
                this.fileName = "blj.png";
		this.sporcuPuani = 95;
                this.ikilik =95;
                this.serbestAtis =95;
                this.ucluk=95;
	}

	public LeBronJames(String basketbolcuAdi, String basketbolcuTakim,String fileName,int sporcuPuani) {
		super(basketbolcuAdi, basketbolcuTakim,fileName,sporcuPuani);
	}

        public int getPenalti() {
            return ikilik;
        }

        public int getSerbestAtis() {
            return serbestAtis;
        }

        public void setPenalti(int ikilik) {
            this.ikilik = ikilik;
        }

        public void setSerbestAtis(int serbestAtis) {
            this.serbestAtis = serbestAtis;
        }

        public void setKaleciKarsiKarsiya(int ucluk) {
            this.ucluk = ucluk;
        }

        public int getKaleciKarsiKarsiya() {
            return ucluk;
        }

        @Override
	public void sporcuPuani_Goster() {
		// TODO Auto-generated method stub
		super.sporcuPuani_Goster();
	}

	public void UsedThisCard() {
		if (kartKullanildiMi == true) {
			System.out.println("This Card Used!");
		} else {
			System.out.println("This Card did not used!");
		}
	}
}
