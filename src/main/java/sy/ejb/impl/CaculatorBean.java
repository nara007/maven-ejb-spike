package sy.ejb.impl;

import sy.ejb.myinterface.Caculator;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Created by root on 15-3-23.
 */
@Stateless
@Remote
public class CaculatorBean implements Caculator{
    @Override
    public float add(float param1, float param2) {
        return param1+param2;
    }
}
