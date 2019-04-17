package com.itcast.rabbitmq;

/**
 * @Author: Chris Wang
 * @Description:
 * @Url:
 * @Params:
 * @Return:
 * @Date:2018/4/6
 * @Other:
 */
public interface Constants {

  String QUEUE_NAME = "test_queue";

  String EXCHANGE_NAME = "test_exchange_fanout";

  String QUEUE_SEARCH = "test_queue_search";

  String QUEUE_WEB = "test_queue_web";

  String QUEUE_SEARCH_DIRECT = "test_queue_search_direct";

  String QUEUE_WEB_DIRECT = "test_queue_web_direct";

  String DIRECT_EXCHANGE_NAME = "test_exchange_direct";

  String INSERT_ACTION = "insert";

  String UPDATE_ACTION = "update";

  String DELETE_ACTION = "delete";


}
