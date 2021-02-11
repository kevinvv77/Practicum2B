public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    Voetbalclub(String naam){
        this.naam = naam;
    }

    public void verwerkResultaat(char ch){
        if (ch == 'w'){
            aantalGewonnen++;
        } else if (ch == 'g'){
            aantalGelijk++;
        } else if (ch == 'v'){
            aantalVerloren++;
        }
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    @Override
    public String toString(){
        return "%-13s %d %d %d %d %d".formatted(
                this.naam,
                aantalGespeeld(),
                this.aantalGewonnen,
                this.aantalGelijk,
                this.aantalVerloren,
                aantalPunten()
                );
    }
}
