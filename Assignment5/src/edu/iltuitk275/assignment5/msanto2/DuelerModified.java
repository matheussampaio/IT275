package edu.iltuitk275.assignment5.msanto2;

/**
 * The Class DuelerModified.
 */
public class DuelerModified extends Dueler {

    /** Keep track if it is the first shoot. */
    private boolean mIsFirstShoot;

    /**
     * Instantiates a new dueler modified.
     *
     * @param name the name of the dueler
     * @param prob the prob to hit the target
     */
    public DuelerModified(String name, double prob) {
        super(name, prob);

        mIsFirstShoot = true;
    }

    /**
     * If it is the first shoot, then intentionally missed the hit. Otherwise, try to hit the target.
     *
     * @param target The target of the shoot.
     * @return If the shoot hit.
     */
    @Override
    public boolean shootAtTarget(Dueler target) {
        if (mIsFirstShoot) {
            mIsFirstShoot = false;

            return false;
        }

        return super.shootAtTarget(target);
    }

}
