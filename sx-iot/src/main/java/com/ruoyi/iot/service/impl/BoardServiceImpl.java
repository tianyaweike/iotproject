package com.ruoyi.iot.service.impl;
import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.common.support.Convert;
import com.ruoyi.iot.service.*;
import com.ruoyi.iot.domain.Board;
import com.ruoyi.iot.mapper.BoardMapper;
import com.ruoyi.iot.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:  BoardSys
 * @description: 广告牌系统
 * @author: 饶泽敏
 * @create: 2019-12-25 15:10
 **/
@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    private BoardMapper boardMapper;

    /**
     * 查询广告牌记录列表
     *
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public List<Board> selectBoardList(Board board) {
        return boardMapper.selectBoardList(board);
    }

    /**
     * 根据id批量删除数据
     * @param id
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteBoardByids(String billboard_id) {
        return boardMapper.deleteBoardByids(Convert.toStrArray(billboard_id));
    }

    /**
     * 添加广告牌公告数据
     * @param  Board
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int insertBoard(Board board) {
        return boardMapper.insertBoard(board);
    }

    /**
     * 根据billboard_id选择数据
     * @param billboard_id
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public Board selectBybillboard_id(String billboard_id) {
        return boardMapper.selectBybillboard_id(billboard_id);
    }

    /**
     * 删除广告牌信息
     * @param Board
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int deleteBoardByIds(String billboard_id) {
        return boardMapper.deleteBoardByIds(billboard_id);
    }

    /**
     * 保存用户修改
     * @param Board
     * @return
     */
    @Override
    @DataSource(value = DataSourceType.SXVILLAGE)
    public int updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

}
