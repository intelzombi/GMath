package Vector;

public class GVECTOR2 {
    public double x;
    public double y;

    public GVECTOR2(GVECTOR2 gv) {
        this.x = gv.x;
        this.y = gv.y;
    }

    public GVECTOR2(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public GVECTOR2 plusEquals(GVECTOR2 gv) {
        this.x += gv.x;
        this.y += gv.y;
        return this;
    }

    public GVECTOR2 minusEquals(GVECTOR2 gv) {
        this.x -= gv.x;
        this.y -= gv.y;
        return this;
    }

    public GVECTOR2 multEquals(double f) {
        this.x *= f;
        this.y *= f;
        return this;
    }

    public GVECTOR2 divEquals(double f) {
        this.x /= f;
        this.y /= f;
        return this;
    }

    public GVECTOR2 scale(double s, GVECTOR2 sgv) {
        GVECTOR2 gv = new GVECTOR2(s*sgv.x, s*sgv.y);
        return gv;
    }

    public boolean equals(GVECTOR2 gv) {
        if(this.x + Vector3._eps >= gv.x &&
           this.x - Vector3._eps <= gv.x &&
           this.y + Vector3._eps >= gv.y &&
           this.y - Vector3._eps <= gv.y) {
            return true;
        }
        return false;
    }

    public boolean notEquals(GVECTOR2 gv) {
        return ! equals(gv);
    }

}
