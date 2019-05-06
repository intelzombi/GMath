package Vector;

public class GVECTOR3 extends GVECTOR {

    public GVECTOR3( GVECTOR gv) {
        this.x = gv.x;
        this.y = gv.y;
        this.z = gv.z;
    }

    public GVECTOR3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public GVECTOR3 plusEquals(GVECTOR3 gv) {
        this.x += gv.x;
        this.y += gv.y;
        this.z += gv.z;
        return this;
    }

    public GVECTOR3 minusEquals(GVECTOR3 gv) {
        this.x -= gv.x;
        this.y -= gv.y;
        this.z -= gv.z;
        return this;
    }

    public GVECTOR3 multEquals(double f) {
        this.x = f * this.x;
        this.y = f * this.y;
        this.z = f * this.z;
        return this;
    }

    public GVECTOR3 divEquals(double f) {
        this.x /= f;
        this.y /= f;
        this.z /= f;
        return this;
    }

    public GVECTOR3 unaryPlus() {
        GVECTOR3 gv = new GVECTOR3(this.x, this.y, this.z);
        return gv;
    }

    public GVECTOR3 unaryMinus() {
        GVECTOR3 gv = new GVECTOR3(-this.x, -this.y, -this.z);
        return gv;
    }

    public GVECTOR3 plus(GVECTOR3 _gv) {
        GVECTOR3 gv = new GVECTOR3(this.x + _gv.x, this.y + _gv.y, this.z + _gv.z);
        return gv;
    }

    public GVECTOR3 minus(GVECTOR3 _gv) {
        GVECTOR3 gv = new GVECTOR3(this.x - _gv.x, this.y - _gv.y, this.z - _gv.z);
        return gv;
    }

    public GVECTOR3 mult(double f) {
        GVECTOR3 gv = new GVECTOR3(this.x *f, this.y *f, this.z *f);
        return gv;
    }

    public GVECTOR3 div(double f) {
        GVECTOR3 gv = new GVECTOR3(this.x/f, this.y/f, this.z/f);
        return gv;
    }

    public GVECTOR3 scale(double s, GVECTOR3 sgv) {
        GVECTOR3 gv = new GVECTOR3(sgv.x *s, sgv.y *s, sgv.z*s);
        return gv;
    }

    public boolean equals(GVECTOR3 _gv) {
        if(this.x + Vector3._eps >= _gv.x &&
           this.x - Vector3._eps <= _gv.x &&
                this.y + Vector3._eps >= _gv.y &&
                this.y - Vector3._eps <= _gv.y &&
                this.z + Vector3._eps >= _gv.z &&
                this.z - Vector3._eps <= _gv.z


        ) {
            return true;
        }
        return false;
    }

    public boolean notEquals(GVECTOR3 _gv) {
        return !equals(_gv);
    }

    public GVECTOR3 Normalize() {
        double magnitude = ( x * x ) +
                ( y * y ) +
                ( z * z );

        double len = Math.sqrt(magnitude);
        if(len > 0.0) {
            len = 1.0f /len;
            x*=len;
            y*=len;
            z*=len;
        }
        return this;
    }

    public static double GDotProduct( GVECTOR3 v1, GVECTOR3 v2) {
        return ( v1.x * v2.x ) + ( v1.y * v2.y ) + ( v1.z * v2.z );
    }

    public static GVECTOR3 GCrossProduct ( GVECTOR3 v1, GVECTOR3 v2 )
    {
        return new GVECTOR3 (( v1.y * v2.z ) - ( v1.z * v2.y ),
                ( v1.z * v2.x ) - ( v1.x * v2.z ),
                ( v1.x * v2.y ) - ( v1.y * v2.x ));
    }
}
