package com.jstarcraft.rns.evaluator.rate;

import com.jstarcraft.ai.math.structure.matrix.SparseMatrix;
import com.jstarcraft.rns.evaluator.AbstractRatingEvaluatorTestCase;
import com.jstarcraft.rns.evaluator.Evaluator;
import com.jstarcraft.rns.evaluator.rating.MSEEvaluator;

import it.unimi.dsi.fastutil.floats.FloatCollection;

public class MSEEvaluatorTestCase extends AbstractRatingEvaluatorTestCase {

	@Override
	protected Evaluator<FloatCollection> getEvaluator(SparseMatrix featureMatrix) {
		return new MSEEvaluator();
	}

	@Override
	protected float getMeasure() {
		return 376666.53F;
	}

}