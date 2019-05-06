package Vector;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class GMATRIX {
    public double _11, _12, _13, _14;
    public double _21, _22, _23, _24;
    public double _31, _32, _33, _34;
    public double _41, _42, _43, _44;
    public double mtx[][]= {{_11, _12, _13, _14},
            {_21, _22, _23, _24},
            {_31, _32, _33, _34},
            {_41, _42, _43, _44}};

    public static final double Identity

    public GMATRIX() {
        mtx [0][0] = _11 = 0.0f;
        mtx [0][1] = _12 = 0.0f;
        mtx [0][2] = _13 = 0.0f;
        mtx [0][4] = _14 = 0.0f;
        mtx [1][0] = _21 = 0.0f;
        mtx [1][1] = _22 = 0.0f;
        mtx [1][2] = _23 = 0.0f;
        mtx [1][3] = _24 = 0.0f;
        mtx [2][0] = _31 = 0.0f;
        mtx [2][1] = _32 = 0.0f;
        mtx [2][2] = _33 = 0.0f;
        mtx [2][3] = _34 = 0.0f;
        mtx [3][0] = _41 = 0.0f;
        mtx [3][1] = _42 = 0.0f;
        mtx [3][2] = _43 = 0.0f;
        mtx [3][3] = _44 = 0.0f;
    }

    public GMATRIX( double _d11, double _d12, double _d13, double _d14,
             double _d21, double _d22, double _d23, double _d24,
             double _d31, double _d32, double _d33, double _d34,
             double _d41, double _d42, double _d43, double _d44 )
    {
         mtx [0][0] = _11 = _d11;
         mtx [0][1] = _12 = _d12;
         mtx [0][2] = _13 = _d13;
         mtx [0][4] = _14 = _d14;
         mtx [1][0] = _21 = _d21;
         mtx [1][1] = _22 = _d22;
         mtx [1][2] = _23 = _d23;
         mtx [1][3] = _24 = _d24;
         mtx [2][0] = _31 = _d31;
         mtx [2][1] = _32 = _d32;
         mtx [2][2] = _33 = _d33;
         mtx [2][3] = _34 = _d34;
         mtx [3][0] = _41 = _d41;
         mtx [3][1] = _42 = _d42;
         mtx [3][2] = _43 = _d43;
         mtx [3][3] = _44 = _d44;

    }

    public GMATRIX( double _d)
    {
        this( _d, _d, _d, _d,
                 _d, _d, _d, _d,
                 _d, _d, _d, _d,
                 _d, _d, _d, _d);

    }

    public void assign(int Row, int Col, double value) {
        mtx[Row][Col] = value;
        resolveGM();
    }

    public double retrieve(int Row, int Col) {
        return mtx[Row][Col];
    }
    private void resolveMtx() {
        mtx [0][0] = _11;
        mtx [0][1] = _12;
        mtx [0][2] = _13;
        mtx [0][4] = _14;
        mtx [1][0] = _21;
        mtx [1][1] = _22;
        mtx [1][2] = _23;
        mtx [1][3] = _24;
        mtx [2][0] = _31;
        mtx [2][1] = _32;
        mtx [2][2] = _33;
        mtx [2][3] = _34;
        mtx [3][0] = _41;
        mtx [3][1] = _42;
        mtx [3][2] = _43;
        mtx [3][3] = _44;
    }

    private void resolveGM() {
         _11 = mtx [0][0];
         _12 = mtx [0][1];
         _13 = mtx [0][2];
         _14 = mtx [0][4];
         _21 = mtx [1][0];
         _22 = mtx [1][1];
         _23 = mtx [1][2];
         _24 = mtx [1][3];
         _31 = mtx [2][0];
         _32 = mtx [2][1];
         _33 = mtx [2][2];
         _34 = mtx [2][3];
         _41 = mtx [3][0];
         _42 = mtx [3][1];
         _43 = mtx [3][2];
         _44 = mtx [3][3];
    }

    public GMATRIX multEquals(GMATRIX gm) {
        GMATRIX tmp = mult(gm);

        this._11 = tmp._11;
        this._12 = tmp._12;
        this._13 = tmp._13;
        this._14 = tmp._14;
        this._21 = tmp._21;
        this._22 = tmp._22;
        this._23 = tmp._23;
        this._24 = tmp._24;
        this._31 = tmp._31;
        this._32 = tmp._32;
        this._33 = tmp._33;
        this._34 = tmp._34;
        this._41 = tmp._41;
        this._42 = tmp._42;
        this._43 = tmp._43;
        this._44 = tmp._44;

        resolveMtx();
        return this;
    }

    public GMATRIX plusEquals(GMATRIX gm) {
        this._11 += gm._11;
        this._12 += gm._12;
        this._13 += gm._13;
        this._14 += gm._14;
        this._21 += gm._21;
        this._22 += gm._22;
        this._23 += gm._23;
        this._24 += gm._24;
        this._31 += gm._31;
        this._32 += gm._32;
        this._33 += gm._33;
        this._34 += gm._34;
        this._41 += gm._41;
        this._42 += gm._42;
        this._43 += gm._43;
        this._44 += gm._44;

        resolveMtx();
        return this;

    }

    public GMATRIX minusEquals(GMATRIX gm) {
        this._11 -= gm._11;
        this._12 -= gm._12;
        this._13 -= gm._13;
        this._14 -= gm._14;
        this._21 -= gm._21;
        this._22 -= gm._22;
        this._23 -= gm._23;
        this._24 -= gm._24;
        this._31 -= gm._31;
        this._32 -= gm._32;
        this._33 -= gm._33;
        this._34 -= gm._34;
        this._41 -= gm._41;
        this._42 -= gm._42;
        this._43 -= gm._43;
        this._44 -= gm._44;

        resolveMtx();
        return this;
    }

    public GMATRIX scaleEquals(double _f ) {
        this._11 *= _f;
        this._12 *= _f;
        this._13 *= _f;
        this._14 *= _f;
        this._21 *= _f;
        this._22 *= _f;
        this._23 *= _f;
        this._24 *= _f;
        this._31 *= _f;
        this._32 *= _f;
        this._33 *= _f;
        this._34 *= _f;
        this._41 *= _f;
        this._42 *= _f;
        this._43 *= _f;
        this._44 *= _f;

        resolveMtx();
        return this;
    }

    public GMATRIX divEquals(double _f) {
        this._11 /= _f;
        this._12 /= _f;
        this._13 /= _f;
        this._14 /= _f;
        this._21 /= _f;
        this._22 /= _f;
        this._23 /= _f;
        this._24 /= _f;
        this._31 /= _f;
        this._32 /= _f;
        this._33 /= _f;
        this._34 /= _f;
        this._41 /= _f;
        this._42 /= _f;
        this._43 /= _f;
        this._44 /= _f;

        resolveMtx();
        return this;
    }

    public GMATRIX mult(GMATRIX gm) {
        GMATRIX tmp = new GMATRIX();
        tmp._11 = this._11 * gm._11 +
                this._12 * gm._21 +
                this._13 * gm._31 +
                this._14 * gm._41;

        tmp._12 = this._11 * gm._12 +
                this._12 * gm._22 +
                this._13 * gm._32 +
                this._14 * gm._42;

        tmp._13 = this._11 * gm._13 +
                this._12 * gm._23 +
                this._13 * gm._33 +
                this._14 * gm._43;

        tmp._14 = this._11 * gm._14 +
                this._12 * gm._24 +
                this._13 * gm._34 +
                this._14 * gm._44;


        tmp._21 = this._21 * gm._11 +
                this._22 * gm._21 +
                this._23 * gm._31 +
                this._24 * gm._41;

        tmp._22 = this._21 * gm._12 +
                this._22 * gm._22 +
                this._23 * gm._32 +
                this._24 * gm._42;

        tmp._23 = this._21 * gm._13 +
                this._22 * gm._23 +
                this._23 * gm._33 +
                this._24 * gm._43;

        tmp._24 = this._21 * gm._14 +
                this._22 * gm._24 +
                this._23 * gm._34 +
                this._24 * gm._44;


        tmp._31 = this._31 * gm._11 +
                this._32 * gm._21 +
                this._33 * gm._31 +
                this._34 * gm._41;

        tmp._32 = this._31 * gm._12 +
                this._32 * gm._22 +
                this._33 * gm._32 +
                this._34 * gm._42;

        tmp._33 = this._31 * gm._13 +
                this._32 * gm._23 +
                this._33 * gm._33 +
                this._34 * gm._43;

        tmp._34 = this._31 * gm._14 +
                this._32 * gm._24 +
                this._33 * gm._34 +
                this._34 * gm._44;


        tmp._41 = this._41 * gm._11 +
                this._42 * gm._21 +
                this._43 * gm._31 +
                this._44 * gm._41;

        tmp._42 = this._41 * gm._12 +
                this._42 * gm._22 +
                this._43 * gm._32 +
                this._44 * gm._42;

        tmp._43 = this._41 * gm._13 +
                this._42 * gm._23 +
                this._43 * gm._33 +
                this._44 * gm._43;

        tmp._44 = this._41 * gm._14 +
                this._42 * gm._24 +
                this._43 * gm._34 +
                this._44 * gm._44;

        tmp.resolveMtx();
        return tmp;
    }

    public GMATRIX plus(GMATRIX gm) {
        GMATRIX gr = new GMATRIX();

        gr._11 = this._11 + gm._11;
        gr._21 = this._12 + gm._12;
        gr._31 = this._13 + gm._13;
        gr._41 = this._14 + gm._14;
        gr._12 = this._21 + gm._21;
        gr._22 = this._22 + gm._22;
        gr._32 = this._23 + gm._23;
        gr._42 = this._24 + gm._24;
        gr._13 = this._31 + gm._31;
        gr._23 = this._32 + gm._32;
        gr._33 = this._33 + gm._33;
        gr._43 = this._34 + gm._34;
        gr._14 = this._41 + gm._41;
        gr._24 = this._42 + gm._42;
        gr._34 = this._43 + gm._43;
        gr._44 = this._44 + gm._44;

        gr.resolveMtx();
        return gr;
    }

    public GMATRIX minus(GMATRIX gm) {
        GMATRIX gr = new GMATRIX();

        gr._11 = this._11 - gm._11;
        gr._21 = this._12 - gm._12;
        gr._31 = this._13 - gm._13;
        gr._41 = this._14 - gm._14;
        gr._12 = this._21 - gm._21;
        gr._22 = this._22 - gm._22;
        gr._32 = this._23 - gm._23;
        gr._42 = this._24 - gm._24;
        gr._13 = this._31 - gm._31;
        gr._23 = this._32 - gm._32;
        gr._33 = this._33 - gm._33;
        gr._43 = this._34 - gm._34;
        gr._14 = this._41 - gm._41;
        gr._24 = this._42 - gm._42;
        gr._34 = this._43 - gm._43;
        gr._44 = this._44 - gm._44;

        gr.resolveMtx();
        return gr;

    }

    public GMATRIX mult(double _f) {
        GMATRIX gr = new GMATRIX();

        gr._11 = this._11 * _f;
        gr._21 = this._12 * _f;
        gr._31 = this._13 * _f;
        gr._41 = this._14 * _f;
        gr._12 = this._21 * _f;
        gr._22 = this._22 * _f;
        gr._32 = this._23 * _f;
        gr._42 = this._24 * _f;
        gr._13 = this._31 * _f;
        gr._23 = this._32 * _f;
        gr._33 = this._33 * _f;
        gr._43 = this._34 * _f;
        gr._14 = this._41 * _f;
        gr._24 = this._42 * _f;
        gr._34 = this._43 * _f;
        gr._44 = this._44 * _f;

        gr.resolveMtx();
        return gr;
    }

    public GMATRIX div(double _f) {
        GMATRIX gr = new GMATRIX();

        gr._11 = this._11 / _f;
        gr._21 = this._12 / _f;
        gr._31 = this._13 / _f;
        gr._41 = this._14 / _f;
        gr._12 = this._21 / _f;
        gr._22 = this._22 / _f;
        gr._32 = this._23 / _f;
        gr._42 = this._24 / _f;
        gr._13 = this._31 / _f;
        gr._23 = this._32 / _f;
        gr._33 = this._33 / _f;
        gr._43 = this._34 / _f;
        gr._14 = this._41 / _f;
        gr._24 = this._42 / _f;
        gr._34 = this._43 / _f;
        gr._44 = this._44 / _f;

        gr.resolveMtx();
        return gr;
    }

    public static GMATRIX GMatrixIdentity(GMATRIX gm) {
        gm.mtx[0][1] = gm.mtx[0][2] = gm.mtx[0][3] =
                gm.mtx[1][0] = gm.mtx[1][2] = gm.mtx[1][3] =
                        gm.mtx[2][0] = gm.mtx[2][1] = gm.mtx[2][3] =
                                gm.mtx[3][0] = gm.mtx[3][1] = gm.mtx[3][2] = 0.0f;

        gm.mtx[0][0] = gm.mtx[1][1] = gm.mtx[2][2] = gm.mtx[3][3] = 1.0f;

        gm.resolveGM();
        return gm;  
    }

    public GMATRIX mult(double _f, GMATRIX gm) {
        GMATRIX gr = new GMATRIX();

        gr._11 = _f * gm._11;
        gr._21 = _f * gm._21;
        gr._31 = _f * gm._31;
        gr._41 = _f * gm._41;
        gr._12 = _f * gm._12;
        gr._22 = _f * gm._22;
        gr._32 = _f * gm._32;
        gr._42 = _f * gm._42;
        gr._13 = _f * gm._13;
        gr._23 = _f * gm._23;
        gr._33 = _f * gm._33;
        gr._43 = _f * gm._43;
        gr._14 = _f * gm._14;
        gr._24 = _f * gm._24;
        gr._34 = _f * gm._34;
        gr._44 = _f * gm._44;

        gr.resolveMtx();
        return gr;
    }

    public boolean equals(GMATRIX _gm) {
        if( ((this._11 +Vector3._eps) >= _gm._11) &&
        ((this._11 -Vector3._eps) <= _gm._11) &&
        ((this._21 +Vector3._eps) >= _gm._21) &&
        ((this._21 -Vector3._eps) <= _gm._21) &&
        ((this._31 +Vector3._eps) >= _gm._31) &&
        ((this._31 -Vector3._eps) <= _gm._31) &&
        ((this._41 +Vector3._eps) >= _gm._41) &&
        ((this._41 -Vector3._eps) <= _gm._41) &&
        ((this._12 +Vector3._eps) >= _gm._21) &&
        ((this._12 -Vector3._eps) <= _gm._21) &&
        ((this._22 +Vector3._eps) >= _gm._22) &&
        ((this._22 -Vector3._eps) <= _gm._22) &&
        ((this._32 +Vector3._eps) >= _gm._32) &&
        ((this._32 -Vector3._eps) <= _gm._32) &&
        ((this._42 +Vector3._eps) >= _gm._42) &&
        ((this._42 -Vector3._eps) <= _gm._42) &&

        ((this._13 +Vector3._eps) >= _gm._13) &&
        ((this._13 -Vector3._eps) <= _gm._13) &&
        ((this._23 +Vector3._eps) >= _gm._23) &&
        ((this._23 -Vector3._eps) <= _gm._23) &&
        ((this._33 +Vector3._eps) >= _gm._33) &&
        ((this._33 -Vector3._eps) <= _gm._33) &&
        ((this._43 +Vector3._eps) >= _gm._43) &&
        ((this._43 -Vector3._eps) <= _gm._43) &&
        ((this._14 +Vector3._eps) >= _gm._24) &&
        ((this._14 -Vector3._eps) <= _gm._24) &&
        ((this._24 +Vector3._eps) >= _gm._24) &&
        ((this._24 -Vector3._eps) <= _gm._24) &&
        ((this._34 +Vector3._eps) >= _gm._34) &&
        ((this._34 -Vector3._eps) <= _gm._34) &&
        ((this._44 +Vector3._eps) >= _gm._44) &&
        ((this._44 -Vector3._eps) <= _gm._44)
          ){
            return true;
        }
        return false;
    }

    public boolean notEqual(GMATRIX _gm) {
        return !equals(_gm);
    }

    public GMATRIX GScale(double sx, double sy, double sz) {
        GMATRIX scale = new GMATRIX(
                sx,    0.0f,   0.0f,  0.0f,
                0.0f,  sy,     0.0f,  0.0f,
                0.0f,  0.0f,   sz,    0.0f,
                0.0f,  0.0f,   0.0f,  1.0f
       );
        scale.resolveMtx();
        return scale;
    }

    public GMATRIX GScale(double s) {
        GMATRIX scale = new GMATRIX(
                s,    0.0f,   0.0f,  0.0f,
                0.0f,  s,     0.0f,  0.0f,
                0.0f,  0.0f,   s,    0.0f,
                0.0f,  0.0f,   0.0f,  1.0f
           );

        scale.resolveMtx();
        return scale;

    }

    public GMATRIX GTranslate(double dx, double dy, double dz) {
        GMATRIX ret = new GMATRIX();

        ret = GMatrixIdentity(ret);
        ret.assign(3, 0,  dx);
        ret.assign(3, 1, dy);
        ret.assign(3, 2, dz);

        return ret;
    }


    public GMATRIX GRotateX(GMATRIX pOut, double angle) {

        double sin_, cos_;
        sin_ = sin(angle);
        cos_ = cos(angle);
        //sincosf(angle, &sin, &cos);  // Determine sin and cos of angle

        pOut._11 = 1.0f; pOut._12 =  0.0f;    pOut._13 = 0.0f;  pOut._14 = 0.0f;
        pOut._21 = 0.0f; pOut._22 =  cos_;    pOut._23 = sin_;  pOut._24 = 0.0f;
        pOut._31 = 0.0f; pOut._32 = -sin_;    pOut._33 = cos_;  pOut._34 = 0.0f;
        pOut._41 = 0.0f; pOut._42 =  0.0f;    pOut._43 = 0.0f;  pOut._44 = 1.0f;

        pOut.resolveMtx();
        return pOut;
    }

    public GMATRIX GRotateY(GMATRIX pOut, double angle) {
        double sin_, cos_;
        sin_ = sin(angle);
        cos_ = cos(angle);
        //sincosf(angle, &sin, &cos);  // Determine sin and cos of angle

        pOut._11 = cos_;  pOut._12 =  0.0f;   pOut._13 = -sin_; pOut._14 = 0.0f;
        pOut._21 = 0.0f;  pOut._22 =  1.0f;   pOut._23 = 0.0f;  pOut._24 = 0.0f;
        pOut._31 = sin_;  pOut._32 =  0.0f;   pOut._33 = cos_;  pOut._34 = 0.0f;
        pOut._41 = 0.0f;  pOut._42 =  0.0f;   pOut._43 = 0.0f;  pOut._44 = 1.0f;

        pOut.resolveMtx();
        return pOut;        
    }

    public GMATRIX GRotateZ(GMATRIX pOut, double angle) {
        double sin_, cos_;
        sin_ = sin(angle);
        cos_ = cos(angle);
        //sincosf(angle, &sin, &cos);  // Determine sin and cos of angle

        pOut._11 = cos_;  pOut._12 =  sin_;   pOut._13 = 0.0f; pOut._14 = 0.0f;
        pOut._21 = -sin_; pOut._22 =  cos_;   pOut._23 = 0.0f; pOut._24 = 0.0f;
        pOut._31 = 0.0f;  pOut._32 =  0.0f;   pOut._33 = 1.0f; pOut._34 = 0.0f;
        pOut._41 = 0.0f;  pOut._42 =  0.0f;   pOut._43 = 0.0f; pOut._44 = 1.0f;

        return pOut;       
    }

    public GVECTOR3 GVex3TransformNormal(GVECTOR3 pout, GVECTOR3 pv, GMATRIX pm) {
        pout.x = pm.mtx[0][0] * pv.x + pm.mtx[1][0] * pv.y + pm.mtx[2][0] * pv.z;
        pout.y = pm.mtx[0][1] * pv.x + pm.mtx[1][1] * pv.y + pm.mtx[2][1] * pv.z;
        pout.z = pm.mtx[0][2] * pv.x + pm.mtx[1][2] * pv.y + pm.mtx[2][2] * pv.z;

        return pout;
    }

    public GMATRIX GMatrixRotationAxis( GMATRIX pout, GVECTOR3 pv, double angle) {
        GVECTOR3 v = new GVECTOR3(pv);

        v.Normalize();
        GMatrixIdentity(pout);
        pout.mtx[0][0] = (1.0f - cos(angle)) * v.x * v.x + cos(angle);
        pout.mtx[1][0] = (1.0f - cos(angle)) * v.x * v.y - sin(angle) * v.z;
        pout.mtx[2][0] = (1.0f - cos(angle)) * v.x * v.z + sin(angle) * v.y;
        pout.mtx[0][1] = (1.0f - cos(angle)) * v.y * v.x + sin(angle) * v.z;
        pout.mtx[1][1] = (1.0f - cos(angle)) * v.y * v.y + cos(angle);
        pout.mtx[2][1] = (1.0f - cos(angle)) * v.y * v.z - sin(angle) * v.x;
        pout.mtx[0][2] = (1.0f - cos(angle)) * v.z * v.x - sin(angle) * v.y;
        pout.mtx[1][2] = (1.0f - cos(angle)) * v.z * v.y + sin(angle) * v.x;
        pout.mtx[2][2] = (1.0f - cos(angle)) * v.z * v.z + cos(angle);

        pout.resolveGM();
        return pout;

    }
}
