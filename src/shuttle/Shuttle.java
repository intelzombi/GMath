package shuttle;

import Vector.GMATRIX;
import Vector.GVECTOR3;
import signal.Signal;

import static Vector.GMATRIX.GMatrixIdentity;


public class Shuttle {
    GVECTOR3 Position;
    GVECTOR3    Right;
    GVECTOR3    Up;
    GVECTOR3    Look;
    Signal signal;
    GMATRIX View;
    GMATRIX     StartWorld;
    GMATRIX     World;
    GVECTOR3    velocity;
    boolean     isShuttleInitialized;
    GMATRIX     mdlRotation;
    double       radianPitch;
    double       radianRoll;
    double       radianYaw;
    Shuttle(){ isShuttleInitialized = false; };
   public void rebuildShuttle(){

   }
   public void initShuttle(){

       Position = new GVECTOR3(0.0f, 0.0f, 0.0f);
       Right    = new GVECTOR3(1.0f, 0.0f, 0.0f);
       Up       = new GVECTOR3(0.0f, 1.0f, 0.0f);
       //_Up      = GVECTOR3(0.0f, 1.0f, 0.0f);
       Look     = new GVECTOR3(0.0f, 0.0f, -1.0f); // -Z axis projecting from camera RH System
       //Look     = GVECTOR3(0.0f, 0.0f, 1.0f); // +Z axis projecting from camera LH System

       GMatrixIdentity(View);

       velocity = new GVECTOR3( 0.0f, 0.0f, 0.0f );
       mdlRotation = mdlRotation.Identity;
       radianPitch = 0.0f;
       radianRoll  = 0.0f;
       radianYaw  = 0.0f;


       isShuttleInitialized = true;
   }
   public void pitch(float angle){

   }
   public void roll(float angle){

   }
   public void rotateY(float angle){

   }
   public void strafe(float d){

   }
   public void walk(float d, bool LH= true){

   }
   public void rise(float d){

   }

}
