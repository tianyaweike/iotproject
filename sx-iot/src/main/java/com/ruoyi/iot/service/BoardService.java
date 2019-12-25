package com.ruoyi.iot.service;
import com.ruoyi.iot.domain.Board;

import java.util.List;
/**
 * @program: BoardSys
 * @description: 广告牌系统
 * @author: 饶泽敏
 * @create: 2019-12-25 15:10
 **/

public interface BoardService {
    /**
     * 查询广告牌记录列表
     *
     * @return
     */
    public List<Board> selectBoardList(Board board);

    /**
     * 根据billboard_id批量删除数据
     * @param billboard_id
     */
    public int deleteBoardByids(String billboard_id);

    /**
     * 添加广告牌公告数据
     * @param  Board
     * @return
     */
    public int insertBoard(Board board);
    /**
     * 根据billboard_id选择数据
     * @param billboard_id
     * @return
     */
    public Board selectBybillboard_id(String billboard_id);
    /**
     * 保存用户修改
     * @param Board
     * @return
     */
    public int updateBoard(Board board);
    /**
     * 删除广告牌信息
     * @param billboard_id
     * @return
     */
    public int deleteBoardByIds(String billboard_id);
}
