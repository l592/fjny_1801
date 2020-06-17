package org.zcn.service;

import org.zcn.pojo.TbItem;
import org.zcn.utils.EasyUIDataGridResult;
import org.zcn.utils.FjnyResult;

public interface TbItemService {
      public EasyUIDataGridResult getTbItemList(Integer page,Integer rows); 
      public FjnyResult saveTbItem(TbItem tbItem);
}
