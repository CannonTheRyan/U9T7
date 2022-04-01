public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object object)
    {
        if (!(object instanceof ThreeDPoint threeDPoint))
        {
            return false;
        }
        return super.equals(threeDPoint) && z == threeDPoint.z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }
}
