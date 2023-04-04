class Distance {
    int KM, MT;
    public void setDistance(int km, int mt) {
        KM = km;
        MT = mt;
    }
    public Distance add(Distance d) {
        Distance result = new Distance();
        result.KM = this.KM + d.KM;
        result.MT = this.MT + d.MT;
        if (result.MT >= 1000) {
            result.KM += result.MT / 1000;
            result.MT = result.MT % 1000;
        }
        return result;
    }
  
    public void show() {
        System.out.println(KM + " km" + MT + " mtr.");
    }
}