package in.ac.iiitb.speart.dao;

import in.ac.iiitb.speart.model.PaintingBuyerMM;
import in.ac.iiitb.speart.model.PaintingRepoDetails;

import java.util.List;

public interface PaintingRepoDetailsDao {

    List<PaintingRepoDetails> get();

    PaintingRepoDetails get(String id);

    void save(PaintingRepoDetails userDetails);

    void delete(int id);

    List<PaintingRepoDetails> getAllDashboardDetails();

    String getArtistName(int id);

    void bidAnArtPieceByUser(Integer buyer_id, Integer p_id);

    Object getBiddingDetailsArtPiece(Integer painting_id);

    PaintingRepoDetails getPaintingDetailsByArtistId(Integer artist_id);

}
