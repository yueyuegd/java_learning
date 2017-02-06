package generics;

/**
 * Created by zhangyue_k on 2016/12/8.
 */
//具有更多层次的实例
interface SuperPower{}
interface XRayVision extends SuperPower{
    void seeThroughWalls();
}
interface SuperHearing extends SuperPower{
    void hearSubtleNoises();
}
interface SuperSmell extends SuperPower{
    void trackBySmell();
}
class superHero<POWER extends SuperPower>{
    POWER power;

    superHero(POWER power) {
        this.power = power;
    }

    POWER getPower() {
        return power;
    }
}
class SuperSleuth<POWER extends XRayVision> extends superHero<POWER>{

    SuperSleuth(POWER power) {
        super(power);
    }
    void see(){
        power.seeThroughWalls();
    }
}
public class EpicBattle {

}
