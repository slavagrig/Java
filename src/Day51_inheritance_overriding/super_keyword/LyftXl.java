package Day51_inheritance_overriding.super_keyword;

public class LyftXl extends Lyft {
    @Override
    public double calculateRate(double miles) {
        return super.calculateRate(miles) * 1.1;
    }
}
