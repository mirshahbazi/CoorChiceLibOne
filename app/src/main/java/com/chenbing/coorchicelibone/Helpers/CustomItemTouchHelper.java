package com.chenbing.coorchicelibone.Helpers;

import android.support.v7.widget.helper.ItemTouchHelper;

import com.chenbing.coorchicelibone.interfaces.CustomItemTouchHelperCallback;
import com.chenbing.coorchicelibone.interfaces.OnItemTouchCallbackListener;

/**
 * Project Name:IceWeather
 * Author:IceChen
 * Date:2016/10/27
 * Notes:
 */

public class CustomItemTouchHelper extends ItemTouchHelper {

  public CustomItemTouchHelper(OnItemTouchCallbackListener onItemTouchCallbackListener) {
    //直接把回调交给父类处理就好
    super(new CustomItemTouchHelperCallback(onItemTouchCallbackListener));
  }
}
