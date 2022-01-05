 val projectBasicSelection: Project.ViewSelection[AspectView, Workflow.WorkflowView[AspectView, VAspect.VAspectView, String, String, String, String], Dataset.DatasetView[VAspect.VAspectView, AspectView, String, String], Schedule.ScheduleView[VAspect.VAspectView, AspectView, String], Team.TeamView[String, String, String, String, String, Member.MemberView[String], String, AspectView], GitSyncStateType.GitSyncStateTypeView, WorkingGitContextView[GitSyncLag.GitSyncLagView, ExternalSyncConfig.ExternalSyncConfigView, Branch.BranchView, Branch.BranchView], Branch.BranchView] =
    Project.view()(
      Aspect.view,
      workflowBasicSelection,
      Dataset.view()(VAspect.view, Aspect.view, Project._id, PhysicalDataset._id),
      Schedule.view()(VAspect.view, Aspect.view, Project._id),
      Selectors.teamBasicSelection,
      GitSyncStateType.view,
      WorkingGitContext.view(GitSyncLag.view, ExternalSyncConfig.view, Branch.view, Branch.view),
      Branch.view
    )